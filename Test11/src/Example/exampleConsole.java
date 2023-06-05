package Example;

import java.io.Console;


public class exampleConsole {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("직업:");
		String job = console.readLine();
		System.out.println("비밀번호:");
		String strpass = console.readLine();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strpass);
	}

}
