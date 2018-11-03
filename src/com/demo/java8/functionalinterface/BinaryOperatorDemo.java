package com.demo.java8.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/*
 * Demonstrates the BinaryOperator Interface
 */
public class BinaryOperatorDemo {

	public static BinaryOperator<Integer> binaryOperatorVar = (a, b) -> a*b;
	
	public static Comparator<Integer> intComparator = (a,b) -> a.compareTo(b);
	
	public static BinaryOperator<Integer> binaryOperatorMaxBy = BinaryOperator.maxBy(intComparator);
	
	public static BinaryOperator<Integer> binaryOperatorMinBy = BinaryOperator.minBy(intComparator);
	

	public static void main(String[] args) {
		System.out.println("BinaryOperatorDemo.main()"+binaryOperatorVar.apply(2, 3));
		System.out.println("BinaryOperatorDemo.main()"+binaryOperatorMaxBy.apply(6, 7));
		System.out.println("BinaryOperatorDemo.main()"+binaryOperatorMinBy.apply(6, 7));
	}
}
