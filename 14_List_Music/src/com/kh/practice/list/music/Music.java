package com.kh.practice.list.music;

import java.util.Objects;

public class Music {
	private String title;
	private String singer;
	
	public Music() {}
	public Music(String title,String singer) {}
	
	//게터세터
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override  //toString 오버라이드
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	@Override  //hashCode  오버라이드
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	@Override  //equals 오버라이드
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	
	public int compareTo(Object o) {
		int result = 0;
		return result;
	}
	
	}

	
	

