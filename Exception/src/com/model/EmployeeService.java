package com.model;

public class EmployeeService {

	public String findByName(String name) throws EmployeeException,RuntimeException  {
		if(null==name) {
			throw new EmployeeException("employee with name: "+name+" is not found");
		}
		return name;
		
	}
	
	public String findName(String name) {
		try {
			findByName(name);
		} catch (EmployeeException | RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	
}
