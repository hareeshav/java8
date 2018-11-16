package com.demo.java8.optional;

import java.util.Optional;

/**
 * Demonstrates isPresent, ifPresent
 * @author hareev
 *
 */
public class OptionalPresentDemo {

	public static void main(String[] args) {
		Optional<String> optionalString = Optional.ofNullable("Hello");
		System.out.println(optionalString.isPresent());
		if(optionalString.isPresent()) {
			System.out.println(optionalString.get());
		}
		optionalString.ifPresent(s->System.out.println(s));
	}
}
