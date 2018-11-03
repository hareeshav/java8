package com.demo.java8.functionalinterface;

import java.util.function.Function;

/*
 * Demonstrates the Function Interface functionality.
 */
public class FunctionDemo {
	
	public static Function<String, String> functionVar = (s) -> s.toUpperCase();
	
	public static Function<String, String> addSomeString = (s) -> s.concat("welcome");

	public static void main(String[] args) {
		System.out.println("FunctionDemo.main()"+ functionVar.apply("haReeSh"));
		System.out.println("FunctionDemo.main()"+ functionVar.andThen(addSomeString).apply("hAreeSh"));
		//compose executes the inner function first and then the outer function.
		System.out.println("FunctionDemo.main()"+ functionVar.compose(addSomeString).apply("hAreeSh"));
	}
}
