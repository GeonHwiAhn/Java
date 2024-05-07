package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
	public static void main(String[] args) {
		
//과일들 String "키위 복숭아 참외 수박 딸기"	
								//Set.of("","","","",)
		TreeSet<String> ts = new TreeSet<>(Set.of("키위", "복숭아", "참외", "수박", "딸기"));
		
		ts.add("키위");
		ts.add("복숭아");
		ts.add("참외");
		ts.add("수박");
		ts.add("딸기");
		
		
		System.out.println(ts);

	
	
	//복숭아 제거 remove
		System.out.println(ts.remove("복숭아"));
	//수박이 포함되어있는지 확인 contains
		System.out.println(ts.contains("수박"));
	//과일들이 비어있는지 확인	isEmpty
		System.out.println(ts.isEmpty());
	//과일들 개수 size
		System.out.println(ts.size());
	//가장 작은 값	first
		System.out.println("가장 작은 값 : " + ts.first());
	//가장 큰 값 last
		System.out.println("가장 큰 값 : " + ts.last());
	//모든 값 제거	clear
		ts.clear();
	//모든 값 제거되었는지 확인
		System.out.println(ts);
	
	
	
	
	}
	
}
