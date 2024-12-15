package com.edu;

import org.springframework.stereotype.Component;

//<bean id="college" class="com.edu.College"></bean>
@Component
public class College {
public void display() {
	  System.out.println("Display method");
}
}
