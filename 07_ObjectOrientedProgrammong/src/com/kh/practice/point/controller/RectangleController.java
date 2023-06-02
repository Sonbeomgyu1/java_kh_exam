package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	Rectangle r = new Rectangle();
	
	
	//사각형의 넓이
	public String calcArea(int x , int y, int height , int width) {
		int Area = width * height;
		String result = "둘레 :"+ x+ " "+ y+ height+ width+" /"+ Area;
		return result;
	}
	
	//사각형의 둘레
	public String calcPerimeter (int x , int y , int height , int width) {
		int Perimeter = 2 * (width + height);
		String result = "면적 :"+ x+","+ y+ height+ width+" /"
		+Perimeter;
		return result;
		
		}
	}

