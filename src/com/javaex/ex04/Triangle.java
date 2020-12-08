package com.javaex.ex04;

public class Triangle {

	private int width;
	private int height;
	
	public Triangle() {
		
	}
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
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

	
	public void draw() {
		System.out.println("삼각형(가로="+width+", 세로="+height+")을 그렸습니다.");
	}
	@Override
	public String toString() {
		return "Traiangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	
}
