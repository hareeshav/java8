package com.demo.java8.optional;

import java.util.Optional;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates optional OrElse,OrElseGet,OrElseThrow
 * 
 * @author hareev
 *
 */
public class OptionalOrElseThrowDemo {

	//OrElse
	public static String optionalOrElse() {
		//Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> optionalStudent = Optional.ofNullable(null);
		return optionalStudent.map(Student::getName).orElse("Default");
	}
	//OrElseGet
	public static String optionalOrElseGet() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> optionalStudent = Optional.ofNullable(null);
		return optionalStudent.map(Student::getName).orElseGet(()->"Default");
	}
	
	//OrElseThrow
		public static String optionalOrElseThrow() {
			//Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
			Optional<Student> optionalStudent = Optional.ofNullable(null);
			return optionalStudent.map(Student::getName).orElseThrow(()->new RuntimeException());
		}
	
	public static void main(String[] args) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseThrow());
	}
}
