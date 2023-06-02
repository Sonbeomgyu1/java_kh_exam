package com.kh.practice.point.model.vo;

public class Rectangle {
	

	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {

	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
