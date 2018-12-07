package com.demo.java8.datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Demonstrates the TimeZone class.
 * 
 * @author hareev
 *
 */
public class TimeZoneDemo {
	
	public static void main(String[] args) {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		//get zone id.
		System.out.println(zonedDateTime.getZone());
		//get zone offset.
		System.out.println(zonedDateTime.getOffset());
		//get all the available zone id's.
		//System.out.println(ZoneId.getAvailableZoneIds());
		//ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		//Total no of supported zones.
		System.out.println(ZoneId.getAvailableZoneIds().size());
		//America/LA time
		ZonedDateTime z1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(z1);
		//Pacific/Majura Time
		ZonedDateTime z2 = ZonedDateTime.now(ZoneId.of("Pacific/Majuro"));
		System.out.println(z2);
		//Asia/Tokyo time
		ZonedDateTime z3 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(z3);
		
		//Zoneddatetime with clock
		ZonedDateTime z4 = ZonedDateTime.now(Clock.systemDefaultZone());
		System.out.println(z4);
		ZonedDateTime z5 = ZonedDateTime.now(Clock.system(ZoneId.of("America/Los_Angeles")));
		System.out.println(z5);
		
		LocalDateTime localDateTimeOfZone = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(localDateTimeOfZone);
		
		LocalDateTime localDateTimeOfZone1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Los_Angeles")));
		System.out.println(localDateTimeOfZone1);
		
		LocalDateTime localDateTimeInstant = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println(localDateTimeInstant);
		
		/**
		 * convert from localdatetime, instant to zoned local date and time.
		 */
		LocalDateTime sysLocalDateTime = LocalDateTime.now();
		System.out.println("System Local Datetime: "+sysLocalDateTime);
		
		System.out.println("Zoneddatetime from datetime: "+sysLocalDateTime.atZone(ZoneId.of("America/Los_Angeles")));
		
		System.out.println("Zoneddatetime from instant: "+Instant.now().atZone(ZoneId.of("America/Los_Angeles")));
		
		OffsetDateTime offsetDateTime = sysLocalDateTime.atOffset(ZoneOffset.ofHours(-8));
		System.out.println("OffsetDateTime from Datetime: "+offsetDateTime);
	}

}
