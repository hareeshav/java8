package com.demo.java8.streams.terminaloperation;

import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates sum(),avg()
 * @author hareev
 *
 */
public class StreamsSumAvgDemo {
	
	public static int sum() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNotebooks));
	}
	
	public static double avg() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNotebooks));
	}
	
	public static void main(String[] args) {
		System.out.println(sum());
		
		System.out.println(avg());
	}

}
