package aop02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	// 스프링 컨테이너에 의해서 설정된 함수가 호출되면, 호출된 함수를 가로채오는 함수
	// => 공통 관심 사항 코드로 구성
	// MethodInvocation invocation : 가로 채온 핵심관심사항 함수가 전달됨
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object returnValue = null;
		// before : 핵심 관심사항 실행 전
		System.out.println("교실문을 연다.");
		
		try {
			// 핵심 관심 사항을 가지고 있는 함수 실행
			returnValue = invocation.proceed();
		} catch(Exception e) {
			// after Throwing : 핵심 관심사항 실행중 예외발생시 실행
			System.out.println("** 오늘은 소독하는 날 **");
		} finally {
			// after Returning : 핵심 관심사항 실행 후 
			System.out.println("전등이 꺼져 있는지 확인한다.");
		}
		// after : 핵심 관심사항 실행 후 
		System.out.println("교실문을 잠근다.");
		return returnValue;
	}

}
