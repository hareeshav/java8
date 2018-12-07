package com.demo.java8.datetime;

import java.time.Duration;
import java.time.Instant;

/**
 * Demonstrates the Instant class
 * @author hareev
 *
 */
public class InstantDemo {
	
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		//get epoch seconds
		System.out.println(instant.getEpochSecond());
		//datetime from epoch
		System.out.println(Instant.ofEpochSecond(0));
		
		Instant instant1 = Instant.now();
		Duration duration = Duration.between(instant, instant1);
		System.out.println("Duration between instants: "+duration.toNanos());
	}

}
