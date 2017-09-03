package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class World{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreeterWorld greetings = (GreeterWorld) context.getBean("greeter");
		System.out.println(greetings.getGreeting());
	}
}
