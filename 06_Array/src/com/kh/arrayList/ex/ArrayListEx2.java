package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
//메서드
	//기본 생성자
	public ArrayListEx2  (){
		
	}
	
	public void method1() {
		// 딸기 바나나 사과
		ArrayList<String> list = new ArrayList<>();
		
		// add를 사용해서 딸기 바나나 사과 추가
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		//get 0 1 2 사용해서 각 index 자리에 값 출력하기
		System.out.println("list.get(0) : " + list.get(0)); //딸기
		System.out.println("list.get(1) : " + list.get(1)); //바나나
		System.out.println("list.get(2) : " + list.get(2)); //사과
		
		// set 바나나 -> 키위 수정
		list.set(1, "키위");
		
		// size 를 이용해서 크기 확인
		//size() 숫자를 넣지 않음 size() 사용
		System.out.println("바구니 크기 : " +list.size());
		// remove 키위 삭제
		list.remove(1);
		//isEmpty() 비어있는지 확인
		System.out.println("장바구니 비어 있나요 ? : "+list.isEmpty());
		
		//장바구니 뭐뭐 들어가 있는지 확인!
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==============");
		//앞으로 사용할 for 문
		for (String 과일 : list ) {
			
			System.out.println(과일);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		//한줄 복사해서 밑에 붙여넣기 단축키 ctrl + alt + ↓
		//add 사자 호랑이 고양이 강아지
		animal.add("사자"); 
		animal.add("호랑이");
		animal.add("고양이"); 
		animal.add("강아지");
		
		//size() 동물이 몇마리 있는지 확인
		System.out.println(animal.size());
		
		//get 으로 동물 확인 
		System.out.println("동물 0 : " + animal.get(0));
		System.out.println("동물 1 : " + animal.get(1));
		System.out.println("동물 2 : " + animal.get(2));
		System.out.println("동물 3 : " + animal.get(3));
		
		//set 고양이 -> 토끼로 변경
		animal.set(2, "토끼");
		//remove 강아지 삭제
		animal.remove("강아지");
		
		//for문을 활용해서 get 출력
		for(String name : animal) {
			System.out.println("동물! : " + name);
		}
		//clear 사용해서 모두 삭제
		animal.clear();
		
		
		//isEmpty() 모두 삭제가 됐는지 확인
		System.out.println("모두 이사합니다.");
		System.out.println("동물들이 모두 비어있나요? " + animal.isEmpty());
	}
	
	
	public void method3() {
		// 피자 가게
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== 피자메뉴 ===");
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페페로니");
		
		// 모두보기
		System.out.println("모든 메뉴 보기 : " + pizza);
		
		//get 을 활용해서 출력
		System.out.println(pizza.get(0));
		System.out.println(pizza.get(1));
		System.out.println(pizza.get(2));
		
		
		// set 활용해서 페페로니 -> 파인애플
		pizza.set(2, "파인애플");
		
		// remove 파인애플
		pizza.remove("파인애플");
			
		// for 문 활용해서 출력
		for(String p : pizza) {
			System.out.println("피자 : " + p);
		}
	
		System.out.println("피자가게가 사라질 예정입니다.");
		// 메뉴 모두 삭제 clear()
		pizza.clear();
		// 메뉴 모두 삭제됐는지 확인 isEmpty()
		System.out.println(pizza.isEmpty());
	}
	
	
	
	
	
	public void method4() {
		// 피자 가게
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== 피자메뉴 ===");
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페페로니");
		pizza.add("고구마1");
		pizza.add("포테이토1");
		pizza.add("페페로니1");
		pizza.add("고구마2");
		pizza.add("포테이토2");
		pizza.add("페페로니2");
	
		// for 문 활용해서 출력
		for(String p : pizza) {
			System.out.println("피자 : " + p);
		}
	
		
	}
	
	
	
	
	
	
	
	//메인 : 최종으로 실행하고 출력하는 메서드
	public static void main(String[] args) {
		ArrayListEx2 ae = new ArrayListEx2();
		//ae.method1();
		//ae.method2();
		//ae.method3();
		ae.method4();
	}

}