package com.demo.java8.lambda;

import java.util.function.Consumer;

public class LambdaRestriction {
	
	static int j =0;
	
	public static void main(String[] args) {
		
		//variable name cannot be used
		int i=0;
		//will thow compilation error.
		//Consumer<String> consumer = (i)->{
		Consumer<String> consumer = (s)->{
			//will not allow as the vaiable is already assigned.
			//int i = 2;
			//Inside lambda the value scope cannot be changed for local variables.
			//i++;
			//No problem for instance or static variables.
			j++;
			System.out.println(s);
			System.out.println(i);
			System.out.println(j);
		};
		
		consumer.accept("t");
	}

}
