package aop04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* classwork())")
	public void before(JoinPoint joinpoint) {
		System.out.println("교실문을 연다.");
	}
	@After("execution(* classwork())")
	public void after(JoinPoint joinpoint) {
		System.out.println("교실문을 닫는다.");
	}
}
