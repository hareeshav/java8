package com.demo.java8.defaultmethods;

import java.util.List;
/**
 * Demonstrates default, static methods introduced in interfaces from Java 8
 * @author hareev
 *
 */
public interface DefaultMethodMutiplier {
	
	int multiply(List<Integer> integerList);
	
	default int listSize(List<Integer> integerList) {
		System.out.println("DefaultMethodMutiplier.listSize()");
		return integerList.size();
	}
	
	static boolean isListEmpty(List<Integer> integerList) {
		return !(integerList!=null && integerList.size()>0);
	}

}
