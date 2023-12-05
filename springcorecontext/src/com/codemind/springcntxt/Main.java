package com.codemind.springcntxt;

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Prajakta");
		emp.setSalary(20000);
		
		Email add = new Email();
		add.setUsername("Prajaktaanugade");
		add.setPassword(123456);
		
		emp.setAdd(add);
		
		System.out.println(emp);
		
	}
	
	

}

