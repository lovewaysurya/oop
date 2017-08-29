package com.texas.oop;
import com.texas.oop.entity.*;

public class MyOop {
	public static void main(String[] args){
		Employee e=new Employee(1,"milan","thapa","ktm");
		Manager m=new Manager(2,"surya","basnet","ktm",100000);
		System.out.println("Employee Reference"+e);
		System.out.println("Manager Reference"+m);
	}

}
