package com.kh.practice.sort;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = 20;
		// SWAP
		// a 방에 b 값으로 바꾸고, b방에 a값으로 바꾸기
		int temp = a;
		a = b;
		b = temp;

		System.out.println(a); // 20
		System.out.println(b); // 10

		// 버블정렬
		String[] nameArr = new String[] {"손범규","천영준","유청하","김민성"};
		// 배열 ==> List


		System.out.print("[");
		for(String ar : nameArr) {
			System.out.print(ar);
			System.out.print(",");
		}
		System.out.print("]");
		for (int i = 0; i < nameArr.length; i++) {
			for (int j = 0; j < nameArr.length - 1 - i; j++) {
				if (nameArr[j].compareTo(nameArr[j-1]) > 0) { // 오름처순
					//if (nameArr[j].compareTo(nameArr[j-1]) < 0) { // 내림차순
						// SWAP
						String tmp = nameArr[j];
						nameArr[j] = nameArr[j + 1];
						nameArr[j + 1] = tmp;
					}
					System.out.println(nameArr);
				}
			}
			System.out.print("[");
			for(String ar : nameArr) {
				System.out.print(ar);
				System.out.print(",");
			}
			System.out.print("]");
			
		
		
			}

		}

	

//System.out.println("이름을 , 로 구분하여 입력해주세요.");
//String names =sc.nextLine();
//StringTokenizer strToken = new StringTokenizer(names, ",");
//List<String> nameList = new ArrayList<String>();
//while(strToken.hasMoreTokens()) {
//	nameList.add(strToken.nextToken());
	
//}
//sc.close();



