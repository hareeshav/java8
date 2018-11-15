package com.demo.java8.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

import sun.text.SupplementaryCharacterData;

/**
 * Demonstrates Parallel Streams.
 * @author hareev
 *
 */
public class ParallelStreamDemo {
	
	public static long checkPerformance(Supplier<Integer> functionSupplier, int noOfTimes) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<noOfTimes;i++) {
			functionSupplier.get();
		}
		
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	
	public static int performSequentialStream() {
		return IntStream.range(1, 100000).sum();
	}
	
	public static int performParallelStream() {
		return IntStream.range(1, 100000).parallel().sum();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Sequential Stream Timing"+checkPerformance(ParallelStreamDemo::performSequentialStream, 20));
		System.out.println("Parallel Stream Timing"+checkPerformance(ParallelStreamDemo::performParallelStream, 20));
		
		//System.out.println("ParallelStreamDemo.main()"+IntStream.range(1, 1000).parallel().sum());
		//System.out.println("ParallelStreamDemo.main()"+IntStream.range(1, 1000).sum());
	}

}
