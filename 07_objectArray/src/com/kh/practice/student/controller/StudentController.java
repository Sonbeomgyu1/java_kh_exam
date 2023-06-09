package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	Student s1 = new Student();
	
	private Student[] sArr = new Student[5];
	
	public final int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0]=new Student("김길동","자바",100);
		sArr[1]=new Student("박길동","디비",50);
		sArr[2]=new Student("이길동","화면",85);
		sArr[3]=new Student("정길동","서버",60);
		sArr[4]=new Student("홍길동","자바",20);
		
	}
	
	public Student[] printStudent() {
	return sArr;
	}
	
	public int sumScore() {
		int sumScore = 0 ;
		for( int i = 0 ; i <5; i++)
			sumScore+=sArr[i].getScore();
		return sumScore;
		
	}
	
	public double[] avgScore() {
		double[] A = new double[2];
		A[0]= sumScore();
		A[1]= sumScore()/5.0;
		return A;
		
	}
	
	

}
