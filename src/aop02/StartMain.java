package aop02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StartMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("aop02/bean.xml");
		
		Person man = (Person) context.getBean("man");
		man.classwork();
		
		System.out.println("---------------------");
		
		Person woman = (Person) context.getBean("woman");
		woman.classwork();
		
		context.close();
		
	}
}