package com.kh.practice.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.Music;

public class MusicController {
	private List<Music>list = new ArrayList<Music>();
	
	public int addList(Music music) {
//		*********** 마지막 위치에 곡 추가 ************
		int result = 0;  // 0: 추가실패,  1:추가성공
		if (list.add(music)) {    //추가
			result = 1;  //
		}
		return result;
	}
	
	public int addAtZero(Music music) {
//		************첫 위치에 곡 추가 ************
		int result = 0;  //0 : 추가실패 1: 추가성공
		int cnt = list.size();
		((ArrayList)list).add(0,music);
		int cntAfter = list.size();
		if(cnt < cntAfter) {
			result = cntAfter-cnt;
		}
		
		return result;
	}
	public List<Music> printAll(){
		return list;
	}
	public Music searchMusic(String title) {
		Music result = null;
		for(Music vo:list) {
			if(vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}
		return result;
	}
	public Music removeMusic(String title) {
		return null;
	}
	public Music setMusic(String title, Music music) {
		return null;
	}
	public int ascTitle() {
		int result = 0;
		return result;
	}
	public int descSinger() {
		int result = 0;
		return result;
	}
}
