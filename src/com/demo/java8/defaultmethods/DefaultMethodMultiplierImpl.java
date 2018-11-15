package com.demo.java8.defaultmethods;

import java.util.List;

public class DefaultMethodMultiplierImpl implements DefaultMethodMutiplier{

	@Override
	public int multiply(List<Integer> integerList) {
		// TODO Auto-generated method stub
		return integerList.stream().reduce(1, (x,y)->x*y);
	}
	
	/*public int listSize(List<Integer> integerList) {
		System.out.println("DefaultMethodMultiplierImpl.listSize()");
		return integerList.size();
	}
*/
}
