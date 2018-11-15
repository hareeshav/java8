package com.demo.java8.defaultmethods;

import java.util.Arrays;
import java.util.List;

public class DefaultMethodMultiplierClient {
	
	public static void main(String[] args) {
		DefaultMethodMultiplierImpl impl = new DefaultMethodMultiplierImpl();
		List<Integer> integerList = Arrays.asList(2,3,4);
		System.out.println(impl.multiply(integerList));
		System.out.println(impl.listSize(integerList));
		System.out.println(DefaultMethodMutiplier.isListEmpty(integerList));
	}

}
