package com.demo.java8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * Demonstrates the Duration class which calculates the difference between Time objects.
 * 
 * @author hareev
 *
 */
public class DurationDemo {
	
	public static void main(String[] args) {
		LocalTime localTime1 = LocalTime.of(10, 10);
		LocalTime localTime2 = LocalTime.of(20, 25);
		long diff = localTime1.until(localTime2, ChronoUnit.MINUTES);
		System.out.println("Difference in Minutes: "+diff);
		Duration duration = Duration.between(localTime1, localTime2);
		System.out.println("Difference in Minutes: "+duration.toMinutes());
		Duration duration1 = Duration.ofHours(10);
		System.out.println("Difference in Minutes: "+duration1.toMinutes());
		Duration duration2 = Duration.ofMinutes(10);
		System.out.println("Difference in Minutes: "+duration2.toMinutes());
		
		//Passing date will throw runtime exception , no compile time issues.
		LocalDate localDate = LocalDate.now();
		LocalDate localDate1 = LocalDate.now().plusDays(1);
		Duration.between(localDate, localDate1);
	}

}
