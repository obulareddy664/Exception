package com.model;

public class EmployeeService {

	public Employee findByName(Employee name) throws EmployeeException,RuntimeException  {
		Employee employee=new Employee();
		if(null==name) {
			throw new EmployeeException("employee with name: "+name+" is not found");
		}else {
			if(name.getUserName().equals("surendra")) {
				employee.setPassword("basha");
				employee.setUserName(name.getUserName());
			}
		}
		return employee;
		
	}
	
	public Employee findName(Employee employee) {
		Employee employee2=new Employee();
		try {
			employee2=findByName(employee);
		} catch (EmployeeException | RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee2;
	}
	
}
