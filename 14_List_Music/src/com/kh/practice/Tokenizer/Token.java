package com.kh.practice.Tokenizer;

import java.util.StringTokenizer;




public class Token {

	public static void main(String[] args) {
		System.out.println("이름을 , 로 구분하여 입력해주세요.");
		
		String str= "손범규,천영준,유청하";
	System.out.println(str);
	System.out.println();
	
	String[] tokens=str.split("=,");
	System.out.println("total tokens:"+tokens.length);
	System.out.println("=======tokens=========");
	
	for(int i =0; i<tokens.length;i++) {
		System.out.println(tokens[i]);
	}
	}
		
		
//		System.out.println("이름을 , 로 구분하여 입력해주세요.");
//		String names = sc.nextLine();
//		StringTokenizer strToken = new StringTokenizer(names, ",");
//		List<String> nameList = new ArrayList<String>();
//		while (strToken.hasMoreTokens()) {
//			nameList.add(strToken.nextToken());
		}
		// 버블 정렬하기
	

	


