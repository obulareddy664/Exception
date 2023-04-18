package com.model;

public class EmployeeService {

	public String testByName(String name) throws EmployeeException {
		if(null==name) {
			throw new EmployeeException("employee with name: "+name+" is not found");
		}
		return name;
		
	}
	
}
