package aop09;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// aop 어노테이션 사용
@Aspect
public class CalcAdvice {
	// 핵심 관심 사항 전 실행 (=before)
	@Before("execution(* *(..))")
	public void before() {
		System.out.println("** 연산시작 **");
	}

	// 핵심 관심 사항 후 실행 (=after)
	@After("execution(* *(..))")
	public void after() {
		System.out.println("** 연산 종료 **");
	}
}
