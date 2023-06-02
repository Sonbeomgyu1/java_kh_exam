package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private SnackController snackb = new SnackController();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);// 
		System.out.println("스낵류를 입력하세요.");
		System.out.printf("종류 : ");
		String kind = sc.nextLine(); //
		System.out.printf("이름 : ");
		String name = sc.nextLine(); //
		System.out.printf("맛 : ");
		String flavor = sc.nextLine(); //
		System.out.printf("개수 : ");
		int numOf = sc.nextInt(); //
		System.out.printf("가격 : ");
		int price = sc.nextInt(); //
//		System.out.println("저장 완료되었습니다.");
		
		String resultStr = snackb.saveData(kind, name, flavor, numOf, price);
		System.out.println(resultStr); // 저장 완료되었습니다.
		
		System.out.print("저장한 정보를 확인하시겠습니까? (y/n) " );
		String input = sc.next();

		if("y".equals(input)) { // y 이면 저장한 정보 출력
			System.out.print(snackb.confirmData());
		} 
	
		
	}
	
}
			
//	SnackController = new

