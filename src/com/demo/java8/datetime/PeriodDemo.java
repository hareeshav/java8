package com.demo.java8.datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * Demonstrates the Period class. Period is compatible with Dates not with Time.
 * 
 * @author hareev
 *
 */
public class PeriodDemo {
	
	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.of(2018, 01, 01);
		LocalDate localDate2 = LocalDate.of(2018, 12, 31);
		//Period from LocalDate objects.
		Period period = localDate1.until(localDate2);
		System.out.println("getDays: "+period.getDays());
		System.out.println("getMonths: "+period.getMonths());
		System.out.println("getYears: "+period.getYears());
		//Period from Factory methods.
		Period period1 = Period.ofDays(10);
		Period period2 = Period.ofYears(10);
		//generates the total months in the period
		System.out.println("getMonths: "+period2.toTotalMonths());
		
		Period period3 = Period.between(localDate1, localDate2);
		System.out.println("getDays: "+period3.getDays());
		System.out.println("getMonths: "+period3.getMonths());
		System.out.println("getYears: "+period3.getYears());
		
	}

}
