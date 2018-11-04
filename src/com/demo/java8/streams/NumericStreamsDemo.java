package com.demo.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsDemo {
	
	public static int sumOfNNumbers(List<Integer> inputList) {
		return inputList.stream().reduce(0,(x,y)->x+y);
	}
	
	public static int sumOfNNumbersIntStream() {
		return IntStream.rangeClosed(1, 10).sum();
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
		System.out.println(sumOfNNumbers(integerList));
		
		System.out.println(sumOfNNumbersIntStream());
		
	}

}
