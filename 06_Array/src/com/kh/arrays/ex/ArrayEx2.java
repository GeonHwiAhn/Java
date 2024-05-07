package com.kh.arrays.ex;

import java.util.Arrays;

public class ArrayEx2 {
	
	//기본 생성자
	public ArrayEx2 (){
		
	}
	
	public void method1() {
		//숫자 배열 생성하기
		int[] num = {6 ,4 ,2 ,3 ,5 ,7, 9};
		
		//숫자 정렬하기 
		Arrays.sort(num);
		//정렬된 내용 출력하기 
		System.out.println(Arrays.toString(num));

		// num 배열 복사하기 abc    
		int abc[] = Arrays.copyOf(num, num.length);
		
		//num과 abc가 같은지 비교하기 
		boolean a = Arrays.equals(num, abc);
		System.out.println(a);
		int[] 채우기 = new int[3];
		Arrays.fill(채우기,6);
		//채워진 채우기 변수를 출력
		System.out.println(Arrays.toString(채우기));
	}
	
	public static void main(String[] args) {
		ArrayEx2 ae = new ArrayEx2();
		ae.method1();

	}

}