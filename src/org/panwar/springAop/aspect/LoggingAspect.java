package org.panwar.springAop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String getName())")
	public void loggingAdvice(){
		System.out.println(" Advice is run... , now get method id called");
	}

}
