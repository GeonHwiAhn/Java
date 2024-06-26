package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

//사용자의 입장에서 바라보는 컴퓨터
public class StudentMenu {
	private StudentController ssm = new StudentController();
//메서드
	//생성자 : 기본
	public StudentMenu() {
		
	}
	//void 학생정보와 성적 결과 출력하는 메서드
	public void printStudentMenu() {
		System.out.println("학생 이름 \t과목 \t점수");
		System.out.println("--------------");
		//for - each
		//String으로 했다면 학생의 이름 or 과목 or 점수
		//Student 이름과 과목과 점수를 모두~~~가지고 오겠다는 의미
		/*		[  ,  ,]			김 박 이 정 홍 길동     */
		for(   Student student : ssm.printStudent()   ) {
			System.out.println(student.inform());
		}
		System.out.println("----------------");
		System.out.println("총점 : " + ssm.sumScore());
		System.out.printf("평균 : %.2f \n" , ssm.avgScore()[1]);
		System.out.print("평균 : "+ ssm.avgScore()[1]   +" \n" );

		System.out.println("합격여부 : " + (ssm.avgScore()[1] >= StudentController.CUT_LINE));
		
		ssm.printPass();
		/*
		 * boolean을 써서 true인지 false인지 한적이 없는데
		 * true와 false 보여집니까?
		 * 			학생들의 평균	>=		합격커트라인
		 * 		ssm.avgScore()[1] >= StudentController.CUT_LINE
		 */
		
	}
	
}
