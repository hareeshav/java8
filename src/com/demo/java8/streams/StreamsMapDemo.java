package com.demo.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates streams map() .
 * 
 * @author hareev
 *
 */
public class StreamsMapDemo {
	
	public static List<String> getNamesList(){
		return StudentDataBase.getAllStudents().stream()
		//Student as an input, name as output
		.map(Student :: getName)
		.map(String :: toUpperCase)
		.collect(Collectors.toList());
	}
	
	public static Set<String> getNamesSet(){
		return StudentDataBase.getAllStudents().stream()
		//Student as an input, name as output
		.map(Student :: getName)
		.map(String :: toUpperCase)
		.collect(Collectors.toSet());
	}
	
	
	public static void main(String[] args) {
		System.out.println(getNamesList());
		System.out.println(getNamesSet());
	}

}
