package com.demo.java8.streams.terminaloperation;

import java.util.stream.Collectors;

import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates counting().
 * 
 * @author hareev
 *
 */
public class StreamsCountingDemo {

	public static long count() {
		return StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() >= 4).collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println(count());
	}
}
