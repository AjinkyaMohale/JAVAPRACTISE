package com.springBeanCollaboration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainerClass {

public static void main(String[] args) {
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		//Employee employee = (Employee)context.getBean("employee10");
	//	System.out.println(employee.toString());	
		
	//	Department department = (Department)context.getBean("department10");
		//System.out.println(department.toString());	

	ApplicationContext context = new AnnotationConfigApplicationContext(Employee.class,Department.class);
	Employee employee=(Employee) context.getBean("employee1");
	employee.setEmployeeName("Ram");
	System.out.println(employee.toString());
	
	Department department=(Department) context.getBean("department1");//java appln context
	department.setDepartmentName("MindFirMe");
	System.out.println(department.toString());
	
	employee.setDepartment(department);  //Dependancy Injecation
	System.out.println(employee.toString());
	
	}

}
