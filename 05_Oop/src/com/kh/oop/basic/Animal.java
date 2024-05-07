package com.kh.oop.basic;

public class Animal {

	//1. 필드 이름 String name 나이 int age
	public String name;
	public int age;
	
	//2. 초기 생성자
	public Animal() {
		
	}
	//3. 필수 생성자 String name, int age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//4. 출력 메서드 public void info(){System.out.println 이름과 나이 출력 }
	public void info() {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
	
	//5. 메인 메서드 public static void main(String[] args){
	public static void main(String[] args) {
		
	
	//	1) 초기생성자
		// Animal dog = new Animal();
		// 강아지의 이름 나이
		// 강아지 정보 출력
		Animal 강아지 = new Animal();
		강아지.name = "멍";
		강아지.age = 5;
		강아지.info();
		
			
	//	2) 필수생성자
		// Animal cat = new Animal("고양이", 3);
		// 고양이 정보 출력
		Animal cat = new Animal("고양이 " ,3);
		cat.info();
	
	}

}