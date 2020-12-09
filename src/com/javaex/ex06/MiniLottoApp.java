package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class MiniLottoApp {
	
	public static void main(String[] args) {
		//로또 번호 생성기 --> 중복 체크 포함
		Set<Integer> Lotto = new HashSet<Integer>(); 
		
		while(Lotto.size()<6){
			int num = (int)(Math.random()*45)+1;
			Lotto.add(num);
		}
		
		for(int i : Lotto) {
			System.out.print(i+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
