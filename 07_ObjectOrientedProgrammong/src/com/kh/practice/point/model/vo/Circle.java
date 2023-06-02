package com.kh.practice.point.model.vo;

public class Circle {
	
	
	
	private int radius;

	public Circle () {}
	
	public Circle(int x, int y, int radius) {
		
	}

	@Override
	public String toString() {
		return "Circle [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
}
