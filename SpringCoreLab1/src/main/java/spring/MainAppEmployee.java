package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAppEmployee {


	public static void main(String[] args) {
		//Employee employeeobj = new Employee();
		
ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		Employee eob = (Employee) context.getBean("employeeobj");
		eob.display();


		
		Employee eob1 =(Employee) context.getBean("employeeobj1");
		eob1.display();
	}


}
