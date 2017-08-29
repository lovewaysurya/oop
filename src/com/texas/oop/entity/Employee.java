package com.texas.oop.entity;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	public Employee(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		firstName = firstName;
		lastName = lastName;
		address = address;
	}
	public void setId(int id){
		this.id=id;
		
	}
	public int getId(){
		return id;
	}
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setAddress(String address){
		this.address=address;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getAddress(){
		return address;
	}
}
