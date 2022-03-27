package com.pojo.com;

public class PojoRunner {
public static void main(String[] args) {
	PojoClass obj = new PojoClass();
	obj.setName("Dhivya");
	obj.setAge(27);
	int age = obj.getAge();
	String name = obj.getName();
	System.out.println("name = " + name + "   age =" + age);
}
}
