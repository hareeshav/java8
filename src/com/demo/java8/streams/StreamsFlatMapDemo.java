package com.demo.java8.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates flatMap(), sorted(), distinct(), count()
 * 
 * @author hareev
 *
 */
public class StreamsFlatMapDemo {
	
	public static List<String> getStudentActivities(){
		return StudentDataBase.getAllStudents().stream().
				map(Student :: getActivities)//Stream <List>String
				.flatMap(List :: stream)//Stream<String>
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	public static Long getStudentActivitiesCount(){
		return StudentDataBase.getAllStudents().stream().
				map(Student :: getActivities)//Stream <List>String
				.flatMap(List :: stream)//Stream<String>
				.distinct()
				.count();
	}
	
	public static void main(String[] args) {
		System.out.println(getStudentActivities());
		System.out.println(getStudentActivitiesCount());
	}

}
