package com.demo.java8.streams.terminaloperation;

import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates joining().
 * @author hareev
 *
 */
public class StreamsJoiningDemo {
	
	public static String joining() {
		return StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(Collectors.joining(","));
	}
	//overloaded version
	public static String joiningPerfixSuffix() {
		return StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(Collectors.joining(",","(",")"));
	}
	
	
	public static void main(String[] args) {
		System.out.println("StreamsJoiningDemo.main()");
		System.out.println(joining());
		System.out.println(joiningPerfixSuffix());
	}

}
