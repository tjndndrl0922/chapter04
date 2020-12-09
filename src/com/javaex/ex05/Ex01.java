package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Set --> HashSet

		Set<Integer> iSet = new HashSet<Integer>();

		//Integer i01 = new Integer(3);
		//Integer i03 = 3; // 박싱
		
		//추가 --> 알아서 박싱 후 iSet에 담아줌.
		iSet.add(3);
		iSet.add(5);
		iSet.add(8);
		
		//toString()
		System.out.println(iSet.toString());
		
		//size()
		System.out.println("Size:"+iSet.size());
		
		//출력  - 향상된 for문 
		//기존 for문은 방번호를 알아야 하는데 방번호가 없음
		for(Integer i :iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("====================================");
		for(Integer i :iSet) { //언박싱된다.
			System.out.println(i);
		}
		
		System.out.println("====================================");
		//삭제
		iSet.remove(3);
		for(Integer i :iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("====================================");
		//중복값 추가 ---> 안들어감.
		iSet.add(5);
		iSet.add(8);
		for(Integer i :iSet) {
			System.out.println(i.toString());
		}
		System.out.println(iSet.size()); //2개
		
		
	}

}
