package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

public class AuditionMenu{
	private AuditionController ssm = new AuditionController();
			
	public AuditionMenu() {
		
	}
	
	public void printAuditionMenu() {
		System.out.println("참가자 이름 과목 점수");
		System.out.println("-----------------");
		
		for(Audition audition : ssm.printAudition()) {
			System.out.println(audition.inform());
		}
		
		System.out.println("-----------------");
		System.out.println("총점 : " + ssm.printAudition());
		System.out.printf("평균 : %.2f \n", ssm.avgScore()[1]);
		System.out.print("평균 : " + (ssm.avgScore()[1] >= AuditionController.CUT_LINE));
		
		ssm.printPass();
	}
}
