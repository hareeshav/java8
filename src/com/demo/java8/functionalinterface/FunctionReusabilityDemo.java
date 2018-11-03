package com.demo.java8.functionalinterface;

public class FunctionReusabilityDemo {
	
	public static String concatString(String input) {
		return FunctionDemo.addSomeString.apply(input);
	}
	
	public static void main(String[] args) {
		System.out.println("FunctionDemo2.main(): "+concatString("teST"));
	}

}
