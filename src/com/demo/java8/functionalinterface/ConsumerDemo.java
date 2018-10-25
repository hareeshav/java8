package com.demo.java8.functionalinterface;

import java.util.function.Consumer;

/**
 * Demonstrates the Consumer functional interface.
 * 
 * @author hareev
 *
 */
public class ConsumerDemo {
	
	public static void main(String[] args) {
		//Accepts a string and convert to uppercase.
		Consumer<String> consumer = (s)->{System.out.println(s.toUpperCase());};
		//pass input to functional interface.
		consumer.accept("hareesh");
	}

}
