package com.demo.java8.parallelstreams;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates parallel stream pipeline.
 * 
 * @author hareev
 *
 */
public class ParallelStreamPipelineDemo {
	
	public static List<String> getStudentActivities(){
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().
				map(Student :: getActivities)//Stream <List>String
				.flatMap(List :: stream)//Stream<String>
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		return studentActivities;
	}
	
	public static List<String> getStudentActivitiesInParallelPipeleine(){
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()
				.parallel()
				.map(Student :: getActivities)//Stream <List>String
				.flatMap(List :: stream)//Stream<String>
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		return studentActivities;
	}
	
	public static void main(String[] args) {
		System.out.println(getStudentActivities());
		System.out.println(getStudentActivitiesInParallelPipeleine());
	}

}
