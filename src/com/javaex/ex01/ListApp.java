package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// 사각형 사각형끼리
		// 원 원끼리
		// 삼각형 삼각형끼리

		// 사각형 관리
		RectList rList = new RectList();

		Rectangle r01 = new Rectangle(3, 9);
		Rectangle r02 = new Rectangle(10, 10);

		rList.add(r01);
		rList.add(r02);

		rList.get(0);
		rList.get(1);

		Rectangle r100 = rList.get(0);
		r100.draw();

		System.out.println(rList.size());

		//원 관리
		Circle cList = new Circle();
		
	}

}
