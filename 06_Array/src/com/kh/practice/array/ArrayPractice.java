package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	//생성자
	public ArrayPractice() {
		
	}
	public void practice1(){
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i] + " ");
		}

	}
	
	public void practice2() {
		int numbers[] = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			
			numbers[i] = numbers.length - i;
			
			System.out.println("numbers[" + i + "] = " +numbers[i] );
		}

	}
	
	public void practice3() {
		//양의 정수를 입력
		Scanner sc= new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		//입력 받은 정수 크기의 배열 생성
		int[] numbers = new int[size]; //size =5
		
		// numbers.length = size
		for(int i = 0; i < numbers.length ; i++){
			numbers[i] = i + 1;
			System.out.println(numbers[i] + " ");
		}
	}
	
	public void practice4() {
						//	0	   1	  2		 3		4
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
	
	}
	
	public void practice6() {
		
	}
		public static void main(String[] args) {
			ArrayPractice ap = new ArrayPractice();
			//ap.practice1();
			//ap.practice2();
			//ap.practice3();
			ap.practice4();
		}
	
}