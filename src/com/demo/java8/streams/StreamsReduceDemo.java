package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Demonstrates reduce()
 * 
 * @author hareev
 *
 */
public class StreamsReduceDemo {
	
	public static int getMultiplicationResult(List<Integer> inputList) {
		return inputList.stream().reduce(1, (a,b)->a*b);
	}
	
	public static Optional<Integer> getMultiplicationResultOptional(List<Integer> inputList) {
		return inputList.stream().reduce((a,b)->a*b);
	}
	
	
	public static void main(String[] args) {
		System.out.println(getMultiplicationResult(Arrays.asList(1,2,3,4)));
		System.out.println(getMultiplicationResultOptional(Arrays.asList(1,2,3,4)).isPresent());
		System.out.println(getMultiplicationResultOptional(Arrays.asList(1,2,3,4)).get());
		System.out.println(getMultiplicationResultOptional(new ArrayList<>()).isPresent());
		System.out.println(getMultiplicationResultOptional(new ArrayList<>()).get());
	}

}
