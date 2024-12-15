package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {


	public static void main(String[] args) {
	//	ApplicationContext context =   
	//		    new ClassPathXmlApplicationContext("applicationContext.xml");  
//
//			    Student student=(Student)context.getBean("studentbean");  
	//		    student.display(); 
			 //for annotation based   
 //ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfiguration.class);	  
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfiguration.class);
		College college =    context.getBean("college",College.class);
		System.out.println("College object ="+college);
		college.display();
		
		Student student=(Student)context.getBean("student",Student.class);  
			    student.display(); 
	}


}
