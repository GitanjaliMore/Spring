package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
	     System.out.println("main App Employee");
	      Employee emp = (Employee) context.getBean("empobj");
	      System.out.println(emp.getEmployeeName());
	      System.out.println(emp.getPhones());
	      System.out.println(emp.getAddress());
	      System.out.println(emp.getCourses());
	


	}

}
