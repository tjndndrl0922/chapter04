package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// 사각형 사각형끼리
		// 원 원끼리
		// 삼각형 삼각형끼리

		// 사각형 관리
		RectList rList = new RectList();

		Rectangle r01 = new Rectangle(2, 5);
		Rectangle r02 = new Rectangle(12, 15);

		rList.add(r01);
		rList.add(r02);

		rList.get(0);
		rList.get(1);

		Rectangle r100 = rList.get(0);
		r100.draw();

		for (int i = 0; i < rList.size(); i++) {
			Rectangle r = rList.get(i);
			r.draw();
			//rList.get(i).draw(); --> 같은 표현
		}

		System.out.println(rList.size());

		// 원 관리
		CircleList cList = new CircleList();

		Circle c01 = new Circle(5);
		
		cList.add(c01);
		
		Circle c100 = cList.get(0);
		c100.draw();
		

		// 삼각형 관리
	}

}
