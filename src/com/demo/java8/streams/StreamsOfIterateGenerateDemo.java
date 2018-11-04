package com.demo.java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfIterateGenerateDemo {
	
	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("Hareesh","Tom","Tim");
		stringStream.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2).limit(10).forEach(System.out::println);
		
		Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier).limit(3).forEach(System.out::println);
	}

}
