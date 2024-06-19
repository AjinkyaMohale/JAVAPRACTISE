package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestContainer {

	public static void main(String[] args) {
		
		ApplicationContext  context=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		Employee emp=(Employee) context.getBean("employee1");
		emp.setId(101);
		emp.setName("Ram");
		emp.setAddress("Pune");
		
		System.out.println(emp.toString());
}
}