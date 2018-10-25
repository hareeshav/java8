package com.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  This class demonstrates the difference between imperative and declarative approach using remove duplicates example.
 * 
 * @author hareev
 *
 */
public class ImperativeVsDeclarative1 {
	public static void main(String[] args) {
		
		List<Integer> inputList = Arrays.asList(1,2,3,4,5,5,5,6,6,7,7,8,8,9,9);
		//Imperative: How style of programming, how we get the result.
		
		List<Integer> uniqueList = new ArrayList<>(); 
		for(Integer i: inputList) {
			if(! uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		System.out.println("Unique Integer List using imperative approach: "+uniqueList);
		
		//Declarative: What style of programming, what result we need. Use parallel to make it parallel.
		List<Integer> uniqueList1 = inputList.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Integer List using declarative approach: "+uniqueList1);
	}

}
