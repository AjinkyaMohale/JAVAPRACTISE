package com.springBeanCollaboration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Department {
	private int departmentId;
	private String departmentName;
	
	@Bean("department1")
	public Department getDepartment(){   
		return new Department();
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	@Override
	public String toString() 
	{
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	

}
