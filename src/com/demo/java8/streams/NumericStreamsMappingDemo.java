package com.demo.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMappingDemo {

	public static List<Integer> mapToObj() {

		List<Integer> integerList = IntStream.rangeClosed(1, 5).mapToObj((i) -> {
			return new Integer(i);
		}).collect(Collectors.toList());

		return integerList;

	}

	public static double mapToDouble() {

		return IntStream.rangeClosed(1, 5).mapToDouble((i) -> i).sum();

	}

	public static long mapToLong() {

		return IntStream.rangeClosed(1, 5).mapToLong((i) -> i).sum();

	}

	public static void main(String[] args) {

		System.out.println("mapToObj : " + mapToObj());

		System.out.println("mapToDouble() : " + mapToDouble());

		System.out.println("mapToLong() : " + mapToLong());

	}

}
