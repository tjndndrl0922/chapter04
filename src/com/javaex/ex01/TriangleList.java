package com.javaex.ex01;

public class TriangleList {

	private Traiangle[] tArray;
	private int crtPos;

	public TriangleList() {
		tArray = new Traiangle[3];
		crtPos = 0;
	}

	public void add(Traiangle t) {
		tArray[crtPos] = t;
		crtPos++;
	}

	public Traiangle get(int index) {
		return tArray[index];
	}

	public int size() {
		return crtPos;
	}
}
