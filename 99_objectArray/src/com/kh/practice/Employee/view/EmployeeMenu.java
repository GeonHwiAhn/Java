package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController ssm = new EmployeeController();
	
	public EmployeeMenu() {
		
	}
	
	public void printEmployeeMenu() {
		System.out.println("직원 이름 과목 점수");
		System.out.println("---------------");
		for( Employee employee : ssm.printEmployee()   ) {
			System.out.println(employee.inform());
		}
		
	}
}
