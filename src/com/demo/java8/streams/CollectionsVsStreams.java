package com.demo.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Demonstrates the difference between Collections and Streams
 * 
 */
public class CollectionsVsStreams {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Hareesh");
		names.add("Tim");
		names.add("Harry");
		System.out.println("CollectionsVsStreams.main()"+names);
		names.remove(1);
		System.out.println("CollectionsVsStreams.main()"+names);
		//No methods to add,modify or delete
		//names.stream().
		//can only be traversed once.
		for(String name: names) {
			System.out.println(name);
		}
		for(String name: names) {
			System.out.println(name);
		}
		
		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
		//Compilation error when traversed second time.
		//namesStream.forEach(System.out::println);
	}

}
