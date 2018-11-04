package com.demo.java8.streams.terminaloperation;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates mapping().
 * @author hareev
 *
 */
public class StreamsMappingDemo {

	public static void main(String[] args) {
		List<String> names = StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println(names);
	}
}
