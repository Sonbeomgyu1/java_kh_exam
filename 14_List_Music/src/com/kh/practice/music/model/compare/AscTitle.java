package com.kh.practice.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.Music;

public class AscTitle implements Comparator<Music> {
	@Override
	public int compare(Music o, Music o2) {
		int result = 0;
		result = o.getTitle().compareTo(o2.getTitle());
		System.out.println("compare 정렬확인: "+result+" - "+ o.getTitle());
		return result;
	}
}