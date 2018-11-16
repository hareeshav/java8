package com.demo.java8.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Demonstrates scenarios when not to use Parallel Streams.
 * @author hareev
 *
 */
public class ParallelStreamNotToUseDemo {
	
	public static int sequentialSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		int sum = integerList.stream().reduce(0, ((x,y)->x+y));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		return sum;
	}
	
	//parallel stream takes more time as boxing,unboxing of integers is needed.
	public static int parallelSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		int sum = integerList.parallelStream().reduce(0, ((x,y)->x+y));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		return sum;
	}
	
	public static void main(String[] args) {
		sequentialSum(IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList()));
		parallelSum(IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList()));
	}

}
