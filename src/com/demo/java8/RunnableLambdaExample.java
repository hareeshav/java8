package com.demo.java8;

/**
 * This class demonstrates the Runnable implementation using Lambda
 * @author hareev
 *
 */
public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		//Prior to Java 8
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside Runnable 1");
				
			}
		};
		
		new Thread(runnable).start();
		
		//Java 8 Lambda Syntax.
		Runnable runnableLambda = () -> {
			System.out.println("Inside Runnable 2");
			};
		
		new Thread(runnableLambda).start();
		
		//For single statements curly braces {} can be ignored , but not for multiple statements.
		Runnable runnableLambdaRefactored = () -> System.out.println("Inside Runnable 3");
		
		new Thread(runnableLambdaRefactored).start();
		
		//Legacy way.
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable legacy");
				
			}
		}).start();
		
		//Java 8 way
		new Thread(() -> System.out.println("Inside Runnable 4")).start();
	}

}
