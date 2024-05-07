package com.kh.oop.method.ex;

public class IceCreamRun {
	//main
	public static void main(String[] args) {
		IceCream ice = new IceCream();
		ice.setName("월드콘");
		ice.setSugar(3);
		ice.setMilk(false);
		ice.makeIceCream();
		System.out.println("-------------------");
		
		IceCream ice1 = new IceCream("바닐라", 1, true);
		ice1.makeIceCream();
	}
	
}
