package com.demo.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates formatting and parsing of LocalDate.
 * 
 * @author hareev
 *
 */
public class FormatLocalDateDemo {
	
	public static void formatLocalDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.format(formatter));
	}
	
	public static void parseLocalDate() {
		String date = "2018-12-08";
		LocalDate localDate = LocalDate.parse(date);//Uses ISO_LOCAL_DATE formatter by default.
		System.out.println(localDate);
		LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localDate1);
		String date1 = "20181208";//yyyymmdd
		LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(localDate2);
		
		//Custom formatter.
		String date2 = "2018|12|08";//yyyy|mm|dd
		LocalDate localDate3 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy|MM|dd"));
		System.out.println(localDate3);
	}
	
	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
	}

}
