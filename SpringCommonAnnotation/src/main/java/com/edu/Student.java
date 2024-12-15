package com.edu;

import org.springframework.stereotype.Component;
//<bean id="studentbean" class="com.edu.Student"></bean>
@Component
public class Student {
	public void display() {
		  System.out.println("Student display");
	}
}
