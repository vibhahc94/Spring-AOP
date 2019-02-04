package com.vibha.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	//Marking the advices
	@Before("execution(* com.vibha.spring.springaop.ProductServiceImpl.multiply(..))") //Point cut expression
	public void logBefore(JoinPoint joinPoint)
	{
		System.out.println("Before calling the method");
	}
	
	@After("execution(* com.vibha.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint)
	{
		System.out.println("After the method invocation");
	}

}
