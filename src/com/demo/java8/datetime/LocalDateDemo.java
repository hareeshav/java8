package com.demo.java8.datetime;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Demonstrates the methods and functionalities of LocalDate class
 * 
 * @author hareev
 *
 */
public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate now: "+localDate);
		//Creates the localdate object for the provided values.
		localDate = LocalDate.of(2018, 2, 23);
		System.out.println("LocalDate Of : "+localDate);
		localDate = LocalDate.ofYearDay(2018, 3);
		System.out.println("LocalDate Of Year Day : "+localDate);
		
		//Retrive values from LocalDate.
		System.out.println("get month value: "+localDate.getMonthValue());
		System.out.println("get month : "+localDate.getMonth());
		System.out.println("get day of month: "+localDate.getDayOfMonth());
		System.out.println("get day of week: "+localDate.getDayOfWeek());
		System.out.println("get day of year: "+localDate.getDayOfYear());
		System.out.println("get day of month using get: "+localDate.get(ChronoField.DAY_OF_MONTH));
		
		//Modifying LocalDate object
		System.out.println(localDate.plusDays(1));
		System.out.println(localDate.plusMonths(1));
		System.out.println(localDate.minusDays(1));
		System.out.println(localDate.withYear(2019));
		//Using temporal field
		System.out.println(localDate.with(ChronoField.YEAR, 2020));
		//Using temporal adjuster
		System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		//Minus using using ChronoUnit that implements Temporal Unit
		System.out.println("Using temporal unit: "+localDate.minus(25, ChronoUnit.YEARS));
		System.out.println("-----------===================--------------------");
		System.out.println("LocalDateDemo.main()"+BigDecimal.ONE.negate());
		
	}
}
