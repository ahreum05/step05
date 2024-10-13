package aop07;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// 공통 관심 사항
public class LoggingAdvice {
	public void logAround(ProceedingJoinPoint joinPoint) 
			throws Throwable {
		// 가로채온 함수의 이름
		String methodName = joinPoint.getSignature().getName();
		
		StopWatch sw = new StopWatch();	// 시간을 재는 클래스
		// before
		System.out.println("[LOG] METHOD : " + methodName + " is calling");
		sw.start();
		
		// 핵심 관심사항
		joinPoint.proceed();
		
		// after
		sw.stop();
		System.out.println("[LOG] METHOD : " + methodName + " was done.");
		System.out.println("[LOG] 처리시간 : " + sw.getTotalTimeMillis() / 1000.0 + "초" );
		
	} 
}
