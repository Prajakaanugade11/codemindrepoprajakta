
package com.codemind.springcntxt;

public class Employee {
	
    Email add ;
	public String name;
	public int salary;  
	
	
	public Email getAdd() {
		return add;
	}
	
	public void setAdd(Email add) {
		this.add = add;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + ", name=" + name + ", salary=" + salary + "]";
		
	    }
	
	
			
	} 
	


