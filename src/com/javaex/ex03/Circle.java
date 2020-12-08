package com.javaex.ex03;

public class Circle {
	
	public int radius;

	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public void draw() {
		System.out.println("원(반지름="+radius+")을 그렸습니다.");
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	

}
