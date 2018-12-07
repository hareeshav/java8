package com.demo.java8.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates formatting & parsing of LocalTime object.
 * 
 * @author hareev
 *
 */
public class FormatLocalTimeDemo {
	
	public static void parseTime() {
		String time = "13:56";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println(localTime);
		
		String time1 = "10:56";
		LocalTime localTime1 = LocalTime.parse(time1, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println(localTime1);
		
		String time2 = "10=56";
		LocalTime localTime2 = LocalTime.parse(time2, DateTimeFormatter.ofPattern("HH=mm"));
		System.out.println(localTime2);
		
		String time3 = "10=56*55";
		LocalTime localTime3 = LocalTime.parse(time3, DateTimeFormatter.ofPattern("HH=mm*ss"));
		System.out.println(localTime3);
		
	}
	
	public static void formatTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH=mm*ss");
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime.format(formatter));
	}
	
	public static void main(String[] args) {
		formatTime();
		parseTime();
	}

}
