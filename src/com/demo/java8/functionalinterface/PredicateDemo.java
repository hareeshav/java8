package com.demo.java8.functionalinterface;

import java.util.function.Predicate;

/**
 * Demonstrates Predicate Functional Interface.
 * 
 * @author hareev
 *
 */
public class PredicateDemo {
	static Predicate<Integer> predicate = (i) -> i%2==0;
	static Predicate<Integer> predicateAnd = (i) -> i%5==0;
	//Commented as the above refactored line is same.
	//Predicate<Integer> predicate = (i) -> {return i%2==0;};
	
	public static void main(String[] args) {
		
		
		System.out.println("PredicateDemo.main()"+predicate.test(2));
		System.out.println("PredicateDemo.main()"+predicate.and(predicateAnd).test(11));
		System.out.println("PredicateDemo.main()"+predicate.or(predicateAnd).test(2));
		System.out.println("PredicateDemo.main()"+predicate.negate().test(2));
	}

}
