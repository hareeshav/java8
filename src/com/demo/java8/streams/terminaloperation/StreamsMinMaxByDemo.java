package com.demo.java8.streams.terminaloperation;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates minBy(),maxBy().
 * @author hareev
 *
 */
public class StreamsMinMaxByDemo {
	
	public static Optional<Student> minBy(){
		return StudentDataBase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxBy(){
		return StudentDataBase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(minBy().isPresent()?minBy().get():"No result");
		System.out.println(maxBy().isPresent()?maxBy().get():"No result");
		
	}

}
