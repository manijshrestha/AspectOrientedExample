package com.manijshrestha.lab.aop;

/**
 * Dummy Service that will get some advice from AOP
 * @author manijshrestha
 *
 */
public class ScreenPrintService implements PrintService{
	
	@Override
	public void print(String message){
		System.out.println(message);
	}

}
