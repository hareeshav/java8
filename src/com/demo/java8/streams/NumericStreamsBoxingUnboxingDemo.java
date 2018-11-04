package com.demo.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingDemo {
	
	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
	}
	
	public static int unboxing(List<Integer> inputList) {
		return inputList.stream().mapToInt(Integer::intValue).sum();
	}
	
	public static void main(String[] args) {
		System.out.println(boxing());
		
		System.out.println(unboxing(Arrays.asList(1,2,3,4,5)));
	}

}
