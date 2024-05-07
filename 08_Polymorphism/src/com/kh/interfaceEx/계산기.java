package com.kh.interfaceEx;

public interface 계산기 {
//필드 public static final
	//final
	double PI = 3.14;
	int 최소값 = - 100_000_000;
	int 최대값 = 100_100_100;
	
//메서드 합 차 곱 몫 나머지를 사용해달라고 작성만 해줬지 계산식을 넣어주진 않았음
	// 미완성됐지만 다른데서 계산기를 불러올 때 필수로 불러와서 완성해줘야 하는 메서드를 작성
	
	//전달받은 두 정수의 합
	public abstract int 합(int a, int b);
	//전달받은 두 정수의 차
	public abstract int 차(int a, int b);
	//전달받은 두 정수의 곱
	public abstract int 곱(int a, int b);
	//전달받은 두 정수의 나누기 결과
	public abstract double 몫(int a, int b);
	//전달받은 두 정수의 나누기 나머지
	public abstract int 나머지(int a, int b);
}
