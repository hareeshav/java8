package com.demo.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Demonstrates the new Date classes introduced as part of Java8
 * @author hareev
 *
 */
public class NewDateTimeDemo {
	
	public static void main(String[] args) {
		//LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date Now: "+localDate);
		//LocalTime
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time Now: "+localTime);
		//LocalDateTime
		LocalDateTime localDatetime = LocalDateTime.now();
		System.out.println("Local Datetime now: "+ localDatetime);
	}

}
