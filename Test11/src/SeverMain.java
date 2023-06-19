
public class SeverMain {

	public static void main(String[] args) {
		//1.서버의 포트번호 정함 ==> 프로그램의 포트번호
		new Tcp().testServer(9001);
	}

}
