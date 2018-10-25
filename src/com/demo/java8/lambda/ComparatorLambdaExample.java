package com.demo.java8.lambda;

import java.util.Comparator;

/**
 * Demonstrates comparator example with Lambdas.
 * 
 * @author hareev
 *
 */
public class ComparatorLambdaExample {
	
	public static void main(String[] args) {
		//Prior to Java 8
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);//0->o1=o2; 1->o1>o2; -1->o1<o2
			}
		};
		
		System.out.println("Result of Comparator is: "+ comparator.compare(3, 2));
		
		//Java 8 way
		Comparator<Integer> lambdaComparator = (Integer o1, Integer o2) -> o1.compareTo(o2);
		System.out.println("Result of Lambda Comparator is: "+ lambdaComparator.compare(3, 2));
		//The type can be ignored.
		Comparator<Integer> lambdaComparatorRefactored = (o1, o2) -> o1.compareTo(o2);
		System.out.println("Result of Lambda Comparator is: "+ lambdaComparatorRefactored.compare(3, 2));
	}

}
