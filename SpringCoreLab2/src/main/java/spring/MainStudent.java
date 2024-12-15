package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {
public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
	ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		Student sob = (Student) context.getBean("studentbean");
		sob.display();
		
		Student sob1 = (Student) context.getBean("studentbean1");
		sob1.display();

	}

}

