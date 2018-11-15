package com.demo.java8.defaultmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates the default methods introduced in Interfaces.
 * 
 * @author hareev
 *
 */
public class DefaultMethodDemo {
	
	public static void main(String[] args) {
		//Sort the List names in Alphabetical order.
		List<String> namesList = Arrays.asList("Hareesh","Alby","Zachariah","Tony","Bob");
		/**
		 * Prior to java 8
		 */
		//Collections.sort(namesList);
		//System.out.println(namesList);
		/**
		 * Java 8 way
		 */
		namesList.sort(Comparator.naturalOrder());
		System.out.println(namesList);
		namesList.sort(Comparator.reverseOrder());
		System.out.println(namesList);
	}

}
