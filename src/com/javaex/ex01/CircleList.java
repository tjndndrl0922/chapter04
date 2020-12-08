package com.javaex.ex01;

public class CircleList {

	private Circle[] cArray;
	private int crtPos;

	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}

	public void add(Circle c) {
		cArray[crtPos] = c;
		crtPos++;
	}
	//범용 ObjList 사용하는데 메모리에 올릴때(new) 삼각형 용으로}

	public Circle get(int index) {
		return cArray[index];
	}

	public int size() {
		return crtPos;
	}
}
