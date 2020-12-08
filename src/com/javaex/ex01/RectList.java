package com.javaex.ex01;

public class RectList {

	private Rectangle[] rArray;
	private int crtPos;

	// 생성자
	public RectList() {
		rArray = new Rectangle[3];
		crtPos = 0;
	}

	// 메소드 g/s 생략

	// 메소드 일반

	public void add(Rectangle r) {
		rArray[crtPos] = r;
		crtPos++;
	}

	// 가져오기
	public Rectangle get(int index) {
		return rArray[index];
	}

	// 몇개
	public int size() {
		return crtPos;
	}
}
