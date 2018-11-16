package com.demo.java8.optional;
/**
 * Demonstrates Of, OfNullable,Empty
 * @author hareev
 *
 */

import java.util.Optional;

public class OptionalOfEmptyNullableDemo {
	
	public static Optional<String> isNullable(){
		//Optional<String> optionalString = Optional.ofNullable("Hello");
		Optional<String> optionalString = Optional.ofNullable(null);
		return optionalString;
	}
	
	public static Optional<String> isOf(){
		//Throws exception is null is passed
		Optional<String> optionalString = Optional.of("Hello");
		//Optional<String> optionalString = Optional.of(null);
		return optionalString;
	}
	
	public static Optional<String> empty(){
		Optional<String> optionalString = Optional.empty();
		return optionalString;
	}
	
	public static void main(String[] args) {
		System.out.println(isNullable().isPresent());
		//will throw exception if no value present.
		//System.out.println(isNullable().get());
		System.out.println(isOf().isPresent());
		System.out.println(empty());
	}


}
