package com.kh.practice.student.model.vo;

public class Student {

	private String name;  //이름
	private String subject;  //과목
	private int score;  //점수
	
	public Student() {}
	public Student(String name,String subject,int score) {
		
	}
	
	public String inform() {
		return null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
