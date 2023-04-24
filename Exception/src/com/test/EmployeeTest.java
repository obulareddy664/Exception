package com.test;

import com.model.Employee;
import com.model.EmployeeException;
import com.model.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) throws EmployeeException {
		
		  EmployeeService employeeService=new EmployeeService();
		  Employee employee=new Employee("surendra", null);
		  System.out.println(employeeService.findName(null));
		  
//		  String cart=null;
//		  if(cart!=null) {
//		  System.out.println(cart.equals("cart"));
//		  }else {
//			  System.out.println("null value coming please process valuess");
//		  }
		
		  
	}
}
