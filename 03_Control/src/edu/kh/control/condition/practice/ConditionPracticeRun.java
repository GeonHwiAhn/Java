package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPracticeRun {

	
	
	
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
			
		if (num > 0 && num % 2 == 0) {
			System.out.println("¦���Դϴ�. ");
		} else {
			System.out.println("Ȧ���Դϴ�. ");
		}
		  
		
		
	}
	
	
	
	
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int korean = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int english = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		int aver = (korean + english + math) / 3;
		
		if(aver < 60 || korean < 40 || english < 40 || math < 40) {
			
			System.out.println("���հ��Դϴ�. ");
		
		
		} else  {
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + aver);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
			
		}
		
	
		
		
		
		
	}
		
	public static void main(String[] args) {
		//practice1();
		practice2();
	}

}
