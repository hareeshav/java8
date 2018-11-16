package com.demo.java8.parallelstreams;

import java.util.stream.IntStream;

/**
 * Demonstrates the sum class logic
 * @author hareev
 *
 */
public class SumClient {
	
	public static void main(String[] args) {
		Sum s = new Sum();
		IntStream.rangeClosed(1, 1000).forEach(s::performSum);
		System.out.println(s.getTotal());
		//Everytime the alue changes as the variabe total is concurrently accessed.So if we have some mutable variable
		//parallel is not encouraged as it will give fluctuating results.
		IntStream.rangeClosed(1, 1000).parallel().forEach(s::performSum);
		System.out.println(s.getTotal());
	}

}
