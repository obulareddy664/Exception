package com.test;

import com.model.EmployeeException;
import com.model.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) throws EmployeeException {
		
		  EmployeeService employeeService=new EmployeeService();
		  employeeService.findName("name");
		  
	}
}
