package com.demo.java8.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates the BiPredicate interface .
 * 
 * @author hareev
 *
 */
public class BiPredicateDemo {
	
	
	Predicate<Student> studentGradePredicate = (s) -> s.getGradeLevel()>=3;
	Predicate<Student> studentGpaPredicate = (s) -> s.getGpa()>=3.9;
	
	BiPredicate<Integer, Double> biPredicate = (grade, gpa)->grade>=3 && gpa >=3.9;
	
	BiConsumer<String, List<String>> studentBiconsumer = (name, activities) -> {System.out.println(name+": "+activities);};
	
	Consumer<Student> studentConsumer = (s) -> {
		if(biPredicate.test(s.getGradeLevel(),s.getGpa())) {
			studentBiconsumer.accept(s.getName(),s.getActivities());
			
		}
	};
	
	public static void main(String[] args) {
		new BiPredicateDemo().printNameAndActivities();
	}
	
	public void printNameAndActivities() {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(studentConsumer);
	}

}
