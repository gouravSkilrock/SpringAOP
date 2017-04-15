package org.panwar.springAop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.panwar.springAop.model.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("getAccess() && forAllCircleMethod()")
	public void loggingAdvice(JoinPoint joinpoint){
		Circle circle=(Circle)joinpoint.getTarget();
		System.out.println(" Advice is run... , now get method id called :b"+circle);
	}
	
	@Before("args(name)")
	public void forSetterMethod(String name){
		System.out.println("Setter methods is called : "+name);
	}
	
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void secondLoggingAdvice(String name,String returnString){
		System.out.println("After returning method id called with argument : "+name+" and In return is :"+returnString);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void throwingAdvicealled(String name,String ex){
		System.out.println("Catching Exception After returning method id called with argument : "+name+" and In return is :"+ex);
	}
	
	
	@Around("getAccess()")
	public Object setAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnObject=null;
		try {
			System.out.println("Around Advice before");
			returnObject = proceedingJoinPoint.proceed();
			System.out.println("Around Advice After");
		} catch (Throwable e) {
			System.out.println("Around Advice Throwing");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Around Advice Finally");
		return returnObject;
	}
	
	@Pointcut("execution( * get*())")
	public void getAccess(){}
	
	@Pointcut("within(org.panwar.springAop.model.Circle)")
	public void forAllCircleMethod(){}
	
	@Pointcut("args(..)")
	public void allParameterArgumentMethod(){}

}
