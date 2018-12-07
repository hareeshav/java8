package com.demo.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Demonstrates how to convert java.util.date & java.sql.date to @LocalDate
 * @author hareev
 *
 */
public class DateToLocalDateDemo {
	
	public static void main(String[] args) {
		/**
		 * Java.util.date to LocalDate and vice versa.
		 */
		Date date = new Date();
		System.out.println(date);
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("LocalDate from Date: "+localDate);
		
		Date date1 = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("Date from LocalDate: "+date1);
		
		/**
		 * java.sql.Date to LocalDate and vice versa.
		 */
		java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
		System.out.println("SQL Date from LocalDate: "+sqlDate);
		
		LocalDate localdate2 = sqlDate.toLocalDate();
		System.out.println("LocalDate from SQL Date : "+localdate2);
	}

}
