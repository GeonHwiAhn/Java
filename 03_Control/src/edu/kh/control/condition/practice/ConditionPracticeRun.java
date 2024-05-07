package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPracticeRun {

	
	
	
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
			
		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수입니다. ");
		} else {
			System.out.println("홀수입니다. ");
		}
		  
		
		
	}
	
	
	
	
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		int aver = (korean + english + math) / 3;
		
		if(aver < 60 || korean < 40 || english < 40 || math < 40) {
			
			System.out.println("불합격입니다. ");
		
		
		} else  {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + aver);
			System.out.println("축하합니다, 합격입니다!");
			
		}
		
	
		
		
		
		
	}
		
	public static void main(String[] args) {
		//practice1();
		practice2();
	}

}
