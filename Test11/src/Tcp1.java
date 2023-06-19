import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp1 {
public void testServer(int port) {
	ServerSocket ss =null;
	Socket sc = null;
	InputStream in = null;
	OutputStream out = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	try {
		ss = new ServerSocket(port);
		System.out.println("서버(나의) IP :"+ ss.getInetAddress());
		System.out.println("서버(나의) 포트 :" + ss.getLocalPort());
		
		while(true) {
			System.out.println("클라이언트 대기중...");
			sc  = ss.accept();
			System.out.println("서버(나의)포트:"+sc.getLocalPort());
			System.out.println("클라이언트 port:"+sc.getPort());
			System.out.println("클라이언트 IP:"+sc.getInetAddress().toString());
			
			in  = sc.getInputStream();
			out = sc.getOutputStream();
			
			br = new BufferedReader(new InputStreamReader(in));
			wr = new BufferedWriter(new OutputStreamWriter(out));
			
			String receivedMsg = null;
			while ((receivedMsg = br.readLine())!=null) {}
			System.out.println("받은메시지:" + receivedMsg);
			wr.write(receivedMsg + ":메시지 잘받았음."\n);
			wr.flush();
			
		}
	}catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(wr!=null)wr.close();
			if(br!=null)br.close();
			if(out!=null)out.close();
			if(in!=null)in.close();
			if(sc!=null)sc.close();
			if(ss!=null)ss.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
