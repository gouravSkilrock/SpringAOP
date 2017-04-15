package org.panwar.springAop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectUsingAopXmlConfiguration {
	
	public Object myAdviceCalledFromAopXml(ProceedingJoinPoint  proceedingJoinPoint){
		
		Object runTimeObject=null;
		
		try {
			System.out.println("Before advice from AOP XML");
			proceedingJoinPoint.proceed();
			System.out.println("after advice from AOP XML");
		} catch (Throwable e) {
			System.out.println("Exception Throwing advice from AOP XML");
			e.printStackTrace();
		}
		System.out.println("Final advice from AOP XML");
		return runTimeObject;	
	}
	
	public void myNewLoginAdvice(){
		System.out.println("Login Advice is called for proxy object");
	}

}
