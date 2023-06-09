import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp {
	public void testServer (int port) {
		//1. 서버의 포트번호 정함 ==> 프로그램의 포트번호 
		ServerSocket ss = null;
		Socket sc = null;
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		BufferedWriter wr = null;
		
		try {
			//2.서버용 소켓 객체 생성
			ss = new ServerSocket(port);  //중요함
			System.out.println("서버(나의) IP :"+ ss.getInetAddress().toString());
			System.out.println("서버(나의) 포트 :" + ss.getLocalPort());
			
			while(true) {
				System.out.println("클라이언트 접속 대기중....");
				//3. 클라이언트 쪽에서 접속 요청이 오길 기다림
				//4. 접속 요청이 오면 요청 수락 후 해당 클라이언트 대한 소켓 객체생성
				sc = ss.accept();   //중요함
				System.out.println("서버(나의)포트:"+sc.getLocalPort());
				System.out.println("클라이언트 port:"+sc.getPort());
				System.out.println("클라이언트 IP:"+sc.getInetAddress().toString());
				
				//5.연결된 클라이언트와 입출력 스트림 생성
				in = sc.getInputStream();  //중요함
				out = sc.getOutputStream(); //중요함
				//6.보조 스트림을 통해 성능 개선
				br = new BufferedReader(new InputStreamReader(in));
				wr = new BufferedWriter(new OutputStreamWriter(out));
				
				String receivedMsg = null;
				while ((receivedMsg = br.readLine())!=null) {}  //중요함
				System.out.println("받은메시지: "+ receivedMsg);
				wr.write(receivedMsg+":메시지 잘 받았음.\n");  //중요함
				wr.flush();  //중요함
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			//Resource leak: '<unassigned Closeable value>' is never closed  //클로즈 한번보기
			if(wr!=null)wr.close();
			if(br!=null)br.close();
			if(out!=null)out.close();
			if(in!=null)in.close();
			if(sc!=null)sc.close();
			if(ss!=null)ss.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
