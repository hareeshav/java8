package com.demo.java8.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates formatting & parsing of LocalDateTime Object.
 * @author hareev
 *
 */
public class FormatLocalDateTimeDemo {
	
	public static void formatDatetime() {
		LocalDateTime localDateTimeObj3 = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd'xyz'HH*mm*ss");
		System.out.println(localDateTimeObj3.format(formatter));
		
	}
	
	public static void parseDatetime() {
		String localDateTime = "2018-04-04T23:33:33";
		LocalDateTime localDateTimeObj = LocalDateTime.parse(localDateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(localDateTimeObj);
		
		String localDateTime1 = "2018-04-04T23:33:33";
		LocalDateTime localDateTimeObj1 = LocalDateTime.parse(localDateTime1);
		System.out.println(localDateTimeObj1);
		
		String localDateTime2 = "2018|04|04T23*33*33";
		LocalDateTime localDateTimeObj2 = LocalDateTime.parse(localDateTime2, DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH*mm*ss"));
		System.out.println(localDateTimeObj2);
		
		String localDateTime3 = "2018|04|04xyz23*33*33";
		LocalDateTime localDateTimeObj3 = LocalDateTime.parse(localDateTime3, DateTimeFormatter.ofPattern("yyyy|MM|dd'xyz'HH*mm*ss"));
		System.out.println(localDateTimeObj3);
	}
	
	public static void main(String[] args) {
		formatDatetime();
		parseDatetime();
	}

}
