package aop09;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CalcMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("aop09/bean.xml");
		CalcMethod calc = (CalcMethod) context.getBean("calc");
		calc.sum(5, 4);
		System.out.println("-----------------");
		calc.div(20, 5);
		
		context.close();
	}
}
