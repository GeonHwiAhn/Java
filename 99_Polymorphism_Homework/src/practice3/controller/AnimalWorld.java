package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Horse;
import practice3.model.vo.Rabbit;

public class AnimalWorld {
	public static void main(String[] args) {
		//5개짜리 animal 타입의 객체 배열 생성
		Animal[] animals = new Animal[5];
		//무작위
		Random random = new Random();
		for(int i = 0; i < animals.length; i++) {
			if(random.nextBoolean()) { 
					//public Rabbit(String name, String kinds, 		int weight, 		String color)
				animals[i] = new Rabbit("토깽이" + i, "토끼",         random.nextInt(20) + 1, "갈색");
			} else {
				//public Horse		(String name, String kinds, 	String location, 		String color)
				animals[i] = new Horse("힝힝이" + 1, "얼룩말",         "우리집" , "흰 & 검정색");
			}
		}
		for(Animal a : animals) {
			a.speak();
			
		}
	}
}
