package springlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
		Samosa sobj = (Samosa) context.getBean("samosa");
		System.out.println("Samosa price="+sobj.getPrice());
		
		Samosa sobj1 = (Samosa) context.getBean("samosa");
		System.out.println("Samosa price="+sobj1.getPrice());
		
		
		context.registerShutdownHook(); //calls detroy method
	}



	}


