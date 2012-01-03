package com.manijshrestha.lab.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * This aspect should kick in every time a method is called in com.manijshrestha.lab.aop package
 * @author manijshrestha
 *
 */
@Aspect
public class MethodCallAspect {
	@Before("execution(* *(..))" + "&& !within(com.manijshrestha.lab.aop.aspects..*)")
	public void methodCalled(JoinPoint jp){
		System.out.println("A Method is being called: " + jp.getSignature());
	}

}
