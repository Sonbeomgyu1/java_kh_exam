package Example;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = scaner.nextLine();
		
		System.out.println("직업:");
		String job = scaner.nextLine();
		
		System.out.println("사번:");
		int num = scaner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
	}

}
