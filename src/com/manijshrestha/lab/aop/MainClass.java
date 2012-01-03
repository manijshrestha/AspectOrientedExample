package com.manijshrestha.lab.aop;

public class MainClass {

	public static void main (String [] args){
		ScreenPrintService printService = new ScreenPrintService();
		printService.print("Some Message...");
	}
}
