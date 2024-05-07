package com.kh.FileEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
StringBuilder




*/
public class BuilderWriterEx {
	public static void main(String[] args) {
		//파일 생성
		String 파일이름 = "줄.txt";
		
		//StringBuilder를 사용해서 파일에 쓸 내용 작성
		StringBuilder 빌더 = new StringBuilder();
		// append : 추가하다
		빌더.append("첫 번쨰 줄이어라. \n");
		빌더.append("두 번쨰 줄이어라. \n");
		빌더.append("세 번쨰 줄이어라. \n");
		
		
		//FileWriter 객체를 생성해서 파일에 쓰기 모드로 열기
		//BufferedWriter를 사용해서 더 빨리 가져올 수 있도록 함
		
		try {
			BufferedWriter 버퍼글쓰기 = new BufferedWriter(new FileWriter(파일이름));
			
			/*
			 System.nanoTime() : 2024.04.25 09:00:00 부터 
			 
			 1ms 1/1000 초
			 lus 1/1000 ms
			 1ns 1/1000 us (1/10억 초)
			 */
			
			long 시작시간 = System.nanoTime();
			
			//파일내용 작성
			버퍼글쓰기.write(빌더.toString());
			
			long 종료시간 = System.nanoTime();
			System.out.println("총 소요시간 : " + (종료시간 - 시작시간));
			//파일닫기
			
			버퍼글쓰기.close();
		
			System.out.println("파일에 내용을 성공적으로 작성했습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
