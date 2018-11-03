package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Demonstrates min(), max() on a List of Integers.
 * 
 * @author hareev
 *
 */
public class StreamsMinMaxDemo {
	
	public static Optional<Integer> getMaxValue(List<Integer> inputList){
		return inputList.stream().reduce((a,b)->a>b?a:b);
	}
	
	public static Optional<Integer> getMinValue(List<Integer> inputList){
		return inputList.stream().reduce((a,b)->a<b?a:b);
	}
	
	public static void main(String[] args) {
		System.out.println(getMaxValue(Arrays.asList(1,2,89,34)).isPresent()?getMaxValue(Arrays.asList(1,2,89,34)).get():"No Value");
		
		System.out.println(getMaxValue(Arrays.asList(1,2,89,34)).isPresent()?getMinValue(Arrays.asList(1,2,89,34)).get():"No Value");
	}

}
