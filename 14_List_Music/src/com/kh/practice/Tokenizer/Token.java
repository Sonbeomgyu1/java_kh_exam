package com.kh.practice.Tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;




public class Token {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 , 로 구분하여 입력해주세요.");
		
		String names = sc.nextLine();
		
		String str= names;
		StringTokenizer strToken = new StringTokenizer(names, ",");
		
		while (strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println(token);
		
	
	}
		}
		
	}
	

//		System.out.println("이름을 , 로 구분하여 입력해주세요.");
//		String names = sc.nextLine();
//		StringTokenizer strToken = new StringTokenizer(names, ",");
//		List<String> nameList = new ArrayList<String>();
//		while (strToken.hasMoreTokens()) {
//			nameList.add(strToken.nextToken());
		
		// 버블 정렬하기
	

	


