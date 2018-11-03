package com.demo.java8.functionalinterface;

/*
 * Demonstrates the Unary Interface
 */
public class UnaryOperatorDemo {
	
	public static java.util.function.UnaryOperator<String> unaryOperator = s->s.toUpperCase();	
	public static void main(String[] args) {
		System.out.println("UnaryOperator.main()" + unaryOperator.apply("teSt"));
	}

}
