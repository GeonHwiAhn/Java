package com.kh.op;

public class OperatorPre {
	//최종 출력해주는 메인 메서드
	public static void main(String[] args) {
		수정1();
	}
	//최종으로 출력하는 메서드는 아님
	//내가 필요할 때 꺼내서 사용하는 메서드
	//메서드 : 특정 상태나 기능을 정리해놓은 집합
	
	//static : 고정된 이라는 뜻을 가지고 있음
		//static 이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라
	// 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현	

	public static void 수정1() {
	//public void 수정1() {
		// 1. int num1 = 10 int num2 = 3
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		int num1 = 10;
		int num2 = 3;
		int 더하기 = num1+num2;
		int 빼기 = num1-num2;
		int 곱하기 = num1*num2;
		int 나누기 = num1/num2;
		System.out.println("더하기 : " + 더하기);
		System.out.println("빼기 : " + 빼기);
		System.out.println("곱하기 : " + 곱하기);
		System.out.println("나누기 : " + 나누기); //10/3 = 몫 3
		//3
		
		// 2. double num3 = 2.5 double num4 = 3.5
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		double num3 = 2.5;
		double num4 = 3.5;
		//실수 덧셈
		double sum = num3+num4;
		//실수 뺄셈
		double sub = num3-num4;
		//실수 곱셈
		double mul = num3*num4;
		//실수 나누기
		double div = num3/num4;
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
	}
}