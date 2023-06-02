package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	private Circle c = new Circle();
	private final double PI = 3.14; 
	
	// 원 넓이 ㅠr제곱
	public String calcArea(int x, int y, int radius) {
		double Area = PI * radius * radius;
		String result = "면적 : " + x+", " + y+", "+ radius+" / " + Area;
		return result;
	}
	
	// 원둘레 2ㅠr
	public String calcCircum(int x, int y, int radius) {
		
		double circum = 2 * PI * radius; // 원둘레
		
		String result = "둘레 : "+ x+", " + y+", "+ radius+" / " + circum;
		
		return result;
	}
}
