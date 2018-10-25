package com.demo.java8.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstartes Predicate interface for the Student Database created.
 * 
 * @author hareev
 *
 */
public class PredicateStudentDemo {
	
	static Predicate<Student> studentPredicate = (s) -> s.getGradeLevel()>=3; 
	static Predicate<Student> studentPredicateAnd = (s) -> s.getGpa()>=3.9;
	
	public static void main(String[] args) {
		
		filterStudentsByGradeLevel();
		filterStudentsByGpa();
		filterStudents();
		
	}

	private static void filterStudentsByGradeLevel() {
		System.out.println("PredicateStudentDemo.filterStudentsByGradeLevel()");
		// TODO Auto-generated method stub
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student)->{
			if(studentPredicate.test(student)) {
				System.out.println(student);
			}
		});
		
	}
	
	private static void filterStudentsByGpa() {
		System.out.println("PredicateStudentDemo.filterStudentsByGpa()");
		// TODO Auto-generated method stub
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student)->{
			if(studentPredicateAnd.test(student)) {
				System.out.println(student);
			}
		});
		
	}

	private static void filterStudents() {
		System.out.println("PredicateStudentDemo.filterStudents()");
		// TODO Auto-generated method stub
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student)->{
			if(studentPredicate.and(studentPredicateAnd).test(student)) {
				System.out.println(student);
			}
		});
		
	}

}
