package com.demo.java8.methodreference;

import java.util.function.Predicate;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates refactoring to lambda expressions for method reference.
 * 
 * @author hareev
 *
 */
public class LambdaMethodReferenceDemo {
	
	//static Predicate<Student> studentPredicate = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> studentPredicate = LambdaMethodReferenceDemo :: testStudentSGrade;
	
	public static boolean testStudentSGrade(Student s) {
		return s.getGradeLevel()>=3;
	}
	
	public static void main(String[] args) {
		System.out.println("LambdaMethodReferenceDemo.main()"+ studentPredicate.test(StudentDataBase.studentSupplier.get()));
	}

}
