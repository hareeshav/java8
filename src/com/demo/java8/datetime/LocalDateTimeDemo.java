package com.demo.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * Demonstrates the LocalDateTime class.
 * 
 * @author hareev
 *
 */
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println(localDateTime.of(LocalDate.now(), LocalTime.now()));
		System.out.println(localDateTime.of(2017,2,2,13,23,23,1232));
		//localDateTime is immutable
		System.out.println(localDateTime);
		
		/**
		 * Retrieve date and time from DateTime instance.
		 */
		System.out.println("Hour: "+localDateTime.getHour());
		System.out.println("Minute: "+localDateTime.getMinute());
		System.out.println("Day of Month: "+localDateTime.getDayOfMonth());
		//using chrono field.
		System.out.println("Day of Month: "+localDateTime.get(ChronoField.DAY_OF_MONTH));
		
		/**
		 * Modifying the local date time value
		 */
		System.out.println("Plus Hours: "+localDateTime.plusHours(2));
		System.out.println("Minus Days: "+localDateTime.minusDays(2));
		System.out.println(localDateTime);
		//with method
		System.out.println("With method: "+localDateTime.withMonth(3));
		
		/**
		 * Convert  localdate,localtime to localdatetime  & get localdate,localtime from localdatetime.
		 */
		LocalDate localDate = LocalDate.of(2019, 1, 1);
		System.out.println("Local date to localdate time: "+localDate.atTime(20,20));
		LocalTime localTime = LocalTime.of(19, 12);
		System.out.println("Local Time to Local Date Time : "+localTime.atDate(localDate));
		
		LocalDateTime localDateTimeDemo = localTime.atDate(localDate);
		System.out.println("Local date from local date time : "+localDateTimeDemo.toLocalDate());
		System.out.println("Local time from local date time : "+localDateTimeDemo.toLocalTime());
	}
}
