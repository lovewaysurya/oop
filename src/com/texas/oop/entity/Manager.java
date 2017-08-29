package com.texas.oop.entity;

public class Manager extends Employee {
	private int salary;

	public Manager(int id, String firstName, String lastName, String address,int salary) {
		super(id, firstName, lastName, address);
		this.salary=salary;
		
	}
	
	public void setSalary(int salary){
		this.salary=salary;
	}
	public int getSalary(){
		return salary;
	}

	@Override
	public String toString() {
		return "Manager [salary=" + salary + "]";
	}
	

}
