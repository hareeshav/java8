package com.demo.java8.streams.terminaloperation;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates groupingBy().
 * 
 * @author hareev
 *
 */
public class StreamsGroupingByDemo {
	
	public static void groupStudentsByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
		//System.out.println((k,v)->println());
		studentMap.forEach((k,v)->{System.out.println(k+"--"+v);});
	}
	
	public static void groupStudentsByCustomizedKey() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(s->s.getGpa()>=3.5?"OUTSTANDING":"AVERAGE"));
		//System.out.println((k,v)->println());
		studentMap.forEach((k,v)->{System.out.println(k+"--"+v);});
	}
	
	public static void twoLevelGrouping() {
		Map<String, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender,Collectors.groupingBy(s->s.getGpa()>=3.7?"OUTSTANDING":"AVERAGE")));
		//System.out.println((k,v)->println());
		studentMap.forEach((k,v)->{System.out.println(k+"--"+v);});
	}
	
	public static void twoLevelGrouping2() {
		Map<String, Integer> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender,Collectors.summingInt(Student::getNotebooks)));
		//System.out.println((k,v)->println());
		studentMap.forEach((k,v)->{System.out.println(k+"--"+v);});
	}
	
	public static void threeArgumentGrouping() {
		LinkedHashMap<String, Set<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));
		//System.out.println((k,v)->println());
		studentMap.forEach((k,v)->{System.out.println(k+"--"+v);});
	}
	
	//maxBy,minBy with grouping
	public static void calculateTopGpa() {
	Map<Integer, Student> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
	
	studentMap.forEach((k,v)->{System.out.println(k+"--"+v);});
	}
	
	public static void calculateLeastGpa() {
		Map<Integer, Student> studentMap = StudentDataBase.getAllStudents().stream()
					.collect(Collectors.groupingBy(Student::getGradeLevel,
							Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
		
		studentMap.forEach((k,v)->{System.out.println(k+"--"+v);});
		}

	public static void main(String[] args) {
		groupStudentsByGender();
		groupStudentsByCustomizedKey();
		twoLevelGrouping();
		twoLevelGrouping2();
		threeArgumentGrouping();
		calculateTopGpa();
		calculateLeastGpa();
	}
}
