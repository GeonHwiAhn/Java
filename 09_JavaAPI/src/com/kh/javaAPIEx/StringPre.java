package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		// substring 메서드를 사용해서 문자열의 일부를 추출 Today
		String 문제1 = "Today is a beautiful day."; 
		String 일부추출 = 문제1.substring(0,5);
		System.out.println(일부추출);
		
		// toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fun and challenging";
		String 대변 = 문제2.toUpperCase();
		System.out.println(대변);
		
		// toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";
		String 소변 = 문제3.toLowerCase();
		System.out.println(소변);
		
		// split 활용해서 문자열을 " "로 구분하
		String 문제4 = "A good meidcine tastes bitter";
		String[] 구분 = 문제4.split(" ");
		for(String a : 구분) {
			System.out.println(a);
		}
		
		System.out.println(구분);
		
		// replace 활용해서 more을 less로 대체
		String 문제5 = "The more, the better";
		String 대체 = 문제5.replace("more", "less");
		System.out.println(대체);
		
		// charAt 사용해서 6번째 글자를 가져오기
		String 문제6 = "Walls have ears";
		char 가져오기 = 문제6.charAt(6);
		System.out.println(가져오기);
		
		// substring 메서드를 사용해서 his부터 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 끝까지추출 = 문제7.substring(14);
		System.out.println(끝까지추출);
		
		
	}

}
