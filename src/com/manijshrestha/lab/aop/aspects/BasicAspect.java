package com.manijshrestha.lab.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BasicAspect {

		@Before(" call(void java.io.PrintStream.println(String))" + "&& !within(com.manijshrestha.lab.aop.aspects..*)")
		public void beforePrintlnCall(){
			System.out.println("AOP: About to do a println");
		}
		
		@After(" call(void java.io.PrintStream.println(String))" + "&& !within(com.manijshrestha.lab.aop.aspects..*)")
		public void afterPrintlnCall(){
			System.out.println("AOP: Done doing a println");
		}
}
