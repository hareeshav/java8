package com.demo.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates customized Sort with a Comparator.
 * 
 * @author hareev
 *
 */
public class StreamsComparatorDemo {
	
	static Comparator<Student> studentComparator = (s1, s2) -> s1.getName().compareTo(s2.getName());
	
	public static List<Student> printAllStudentsSortedUsingComparator() {
		return StudentDataBase.getAllStudents().stream()
		.sorted(studentComparator)
		.collect(Collectors.toList());
	}
	
	public static List<Student> printAllStudentsSortedByName() {
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	}
	
	public static List<Student> printAllStudentsSortedByGPADesc() {
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println("results sorted by Name");
		printAllStudentsSortedByName().forEach(System.out::println);
		System.out.println("results sorted by GPA");
		printAllStudentsSortedByGPADesc().forEach(System.out::println);
		//System.out.println(printAllStudentsSortedUsingComparator());
	}

}
