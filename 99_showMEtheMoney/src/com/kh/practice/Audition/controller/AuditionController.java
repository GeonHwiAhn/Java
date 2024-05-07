package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {
	private Audition[] sArr = new Audition[5];
	public static final int CUT_LINE = 60;
	
	
	public AuditionController() {
		sArr[0] = new Audition("김영희", "발라드", 100);
		sArr[1] = new Audition("박영희", "힙합", 50);
		sArr[2] = new Audition("이연희", "뮤지컬", 85);
		sArr[3] = new Audition("정영희", "댄스", 60);
		sArr[4] = new Audition("홍영희", "팝", 20);
	}
	public Audition[] printAudition() {
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(Audition s : sArr) {
			sum += s.getScore();
		}
		
		return sum;
	}
	
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length;
				return avgArr;
	}
	
	public void printPass() {
		for (Audition s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " 학생은 " + (s.isPassed() ? "통과" : "불합격") + "입니다.");
			
		}
	}
}
