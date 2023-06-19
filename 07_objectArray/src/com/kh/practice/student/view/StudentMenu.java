package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		
		System.out.println("========== 학생 정보 출력 ==========");
		for(Student i : ssm.printStudent())
			System.out.println(i.inform());
		
		
		
		System.out.println("========== 학생 성적 출력 ==========");
		double [] i =ssm.avgScore();
		System.out.println("학생점수합계:"+i[0]);
	System.out.println("학생점수평균:"+i[1]);
		
		
		
		System.out.println("========== 성적 결과 출력 ==========");
		for(Student s: ssm.printStudent())
			if(s.getScore()>=ssm.CUT_LINE)
				System.out.println(s.getName()+"학생은 통과입니다.");
			else System.out.println(s.getName()+"학생은 재시험 대상입니다.");
	}
}
