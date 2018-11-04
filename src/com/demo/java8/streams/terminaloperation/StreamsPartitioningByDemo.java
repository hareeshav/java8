package com.demo.java8.streams.terminaloperation;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates partitioningBy().
 * 
 * @author hareev
 *
 */
public class StreamsPartitioningByDemo {
	
	public static void partitionBy() {
		Predicate<Student> studentGpaPredicate = s->s.getGpa()>=3.6;
		Map<Boolean, List<Student>> partitionMap = StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(studentGpaPredicate));
		partitionMap.forEach((k,v)->{System.out.println(k+"-->"+v);});
	}
	
	public static void twoArgumentPartitionBy() {
		Predicate<Student> studentGpaPredicate = s->s.getGpa()>=3.6;
		Map<Boolean, Set<Student>> partitionMap = StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(studentGpaPredicate, Collectors.toSet()));
		partitionMap.forEach((k,v)->{System.out.println(k+"-->"+v);});
	}
	
	public static void main(String[] args) {
		partitionBy();
		twoArgumentPartitionBy();
	}

}
