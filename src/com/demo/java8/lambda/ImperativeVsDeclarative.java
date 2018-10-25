package com.demo.java8.lambda;

import java.util.stream.IntStream;

/**
 * This class demonstrates the difference between imperative and declarative approach using sum of 1 to 100 nos example.
 * 
 * @author hareev
 *
 */
public class ImperativeVsDeclarative {
	
	public static void main(String[] args) {
		//Imperative: How style of programming, how we get the result.
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println("Sum of nos using imperative approach: "+sum);
		
		//Declarative: What style of programming, what result we need. Use parallel to make it parallel.
		int sum1 = IntStream.rangeClosed(0, 100).parallel().sum();
		System.out.println("Sum of nos using declarative approach: "+sum1);
	}

}
