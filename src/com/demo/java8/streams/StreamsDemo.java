package com.demo.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates Streams
 * 
 * @author hareev
 *
 */
public class StreamsDemo {
	
	static Predicate<Student> studentPredicate = (s) -> s.getGradeLevel()>=3; 
	static Predicate<Student> studentGpaPredicate = (s) -> s.getGpa()>=3.9; 
	
	public static void main(String[] args) {
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream().
				filter(studentPredicate).filter(studentGpaPredicate).
				collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentMap);
		
		Map<String, List<String>> studentMapPeek = StudentDataBase.getAllStudents().stream().
				peek((student)->{System.out.println(student);}).
				filter(studentPredicate).
				peek((student)->{System.out.println("after 1st filter"+student);}).
				filter(studentGpaPredicate).
				peek((student)->{System.out.println("after 2nd filter"+student);
				
				}).
				collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		 List<String> studentActivities = StudentDataBase.getAllStudents().
	                stream() // Stream<Student>
	                .map(Student::getActivities) //<Stream<List<Activites>>
	                .flatMap(List::stream) //<Stream<String>
	                .distinct() // removes duplicates
	                .collect(Collectors.toList()); //collects it to a list.

	        List<String> namesList = StudentDataBase.getAllStudents().
	                stream() // Stream<Student>
	                .peek((student -> {
	                    System.out.println(student);
	                }))
	                .map(Student::getName) //<Stream<List<Activites>>
	                .peek(System.out::println)
	                .distinct() // removes duplicates
	                .collect(Collectors.toList()); //collects it to a list.

	        System.out.println("namesList  : " + namesList);
	}

}
