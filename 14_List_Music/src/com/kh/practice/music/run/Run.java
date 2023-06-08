package com.kh.practice.music.run;

import com.kh.practice.music.view.MusicView;

public class Run {

	public static void main(String[] args) {
		String a = "김가";
		String b = "김나";
		int result = a.compareTo(b);
		System.out.println(result);
		
		new MusicView().mainMenu();
	}

}