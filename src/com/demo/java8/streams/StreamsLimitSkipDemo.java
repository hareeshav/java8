package com.demo.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Demonstrates skip() and limit().
 * 
 * @author hareev
 *
 */
public class StreamsLimitSkipDemo {
	
	public static Optional<Integer> skip(List<Integer> inputList){
		return inputList.stream().skip(2).
				reduce((x,y)->x+y);
	}
	
	public static Optional<Integer> limit(List<Integer> inputList){
		return inputList.stream().limit(2).
				reduce((x,y)->x+y);
	}

	public static void main(String[] args) {
		
		System.out.println("StreamsLimitSkipDemo.main()");
		Optional<Integer> result = skip(Arrays.asList(2,3,4,5));
		System.out.println(result.isPresent()?result.get():"No result");
		Optional<Integer> result1 = limit(Arrays.asList(2,3,4,5));
		System.out.println(result1.isPresent()?result1.get():"No result");
		
	}
}
