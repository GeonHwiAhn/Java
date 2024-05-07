package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
	//최종 출력해줄 메서드
	public static void main(String[] args) {
		//method1();
		method2();
	}
	public static void method1() {
		//Scanner 를 이용해 num1 num2 의 값을 입력받고
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 의 값을 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("num2 의 값을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		boolean result1 = num1 > num2;
		System.out.println("num1 >  num2 =" + result1);
		boolean result2 = num1 >= num2;
		System.out.println("num1 >= num2 = " + result2);
		boolean result3 = num1 < num2;
		System.out.println("num1 <  num2 = " + result3);
		boolean result4 = num1 <= num2;
		System.out.println("num1 <=  num2 = " + result4);
	}
	
	public static void method2() {
		// num1 num2 num3  스캐너를 이용해서 숫자받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번 째 숫 자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번 째 숫 자 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번 째 숫 자 : ");
		int num3 = sc.nextInt();
		// &&  if while  조건을 체크할 때
		// 		두 개의 조건이 모두 만족하는 경우 사용
		//	&	비트 단위 연산으로 특정 비트 패턴을 판단할 때 사용 
		boolean result = (num1 < num2) && (num2 == num3);
		System.out.println("(num1 < num2) && (num2 == num3) 결과는!! " + result);
	
	}
}