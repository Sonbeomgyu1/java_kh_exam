package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print(" 메뉴 번호 :");
		int menuNum = sc.nextInt();
		if(menuNum == 1) {
			circleMenu();
		}
		else if(menuNum == 2) {
			rectangleMenu();
		}
		else if(menuNum == 9) {
			System.out.println(" 종료합니다.");
		}
		else {
			mainMenu(); //다시 받도록 반복하기
		}
		
			
		
		
		
			
	}
	
	
	public void circleMenu() {
		System.out.println("==== 원 메뉴 ====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print(" 메뉴 번호 :");
		int menuNum = sc.nextInt();
		
		// 원둘레 계산
		if(menuNum == 1) {
			calcPerimeter();
		} 
		else if(menuNum == 2) {
			calcArea();			
		}
		
	}
	
	
	public void rectangleMenu() {
		System.out.println("==== 사각형 메뉴 ====");
		System.out.println("1. 사각형 둘레");
		
		System.out.println("2. 사각형 넓이");
		System.out.println("3. 메인으로");
		System.out.print("메뉴 번호 :");
		int menuNum = sc.nextInt();
		
		//사각형의 넓이
		if(menuNum == 2) {
			calcArea1();
		} 
		//사각형의 둘레
		else if(menuNum == 1) {
			calcPerimeter1();			
		}
		
		
	}
	// 원 둘레 출력 (2ㅠr)
	public void calcPerimeter() {
		Scanner numOf =new Scanner(System.in);
		System.out.print("x 좌표 :");
		int a = numOf.nextInt();
		System.out.print("y 좌표 :");
		int b = numOf.nextInt();
		System.out.print("반지름 :");
		int c = numOf.nextInt();
		
		
		// 원둘레 컨트롤러 메소드 호출
		System.out.println(cc.calcCircum(a, b, c));
		
		// 메인메뉴로 이동
		mainMenu();
	}
	// 원 넒이 출력
	public void calcArea() {
		Scanner numOf =new Scanner(System.in);
		System.out.print("x 좌표 :");
		int d = numOf.nextInt();
		System.out.print("y 좌표 :");
		int e = numOf.nextInt();
		System.out.print("반지름 :");
		int f = numOf.nextInt();
		System.out.println(cc.calcArea(d, e, f));
		mainMenu();
		
	}
	// 사각형 둘레
	public void calcPerimeter1() {
		Scanner numOf1 =new Scanner(System.in);
		System.out.print("x 좌표 :");
		int g = numOf1.nextInt();
		System.out.print("y 좌표 :");
		int h = numOf1.nextInt();
		System.out.print("높이 :");
		int i = numOf1.nextInt();
		System.out.print("너비 :");
		int j = numOf1.nextInt();
		System.out.println(rc.calcPerimeter(g, h , i, j));
		mainMenu();
	}
	//사각형의 넓이 
	public void calcArea1() {
		Scanner numOf =new Scanner(System.in);
		System.out.print("x 좌표 :");
		int k = numOf.nextInt();
		System.out.print("y 좌표 :");
		int l = numOf.nextInt();
		System.out.print("높이 :");
		int m = numOf.nextInt();
		System.out.print("너비 :");
		int n = numOf.nextInt();
		System.out.println(rc.calcArea(k, l , m, n));
		mainMenu();
		
	}
	
	
	
//	public void calcRectArea() {}  
//	//x.y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 넓이 출력 
//	
	
	
}
