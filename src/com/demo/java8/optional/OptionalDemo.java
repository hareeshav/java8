package com.demo.java8.optional;

import java.util.Optional;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates usage of Optional.
 * 
 * @author hareev
 *
 */
public class OptionalDemo {
	
	public static String getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
		//Student student = null;
		if(null != student) {
			return student.getName();
		}else {
			return null;
		}
	}
	
	public static Optional<String> getStudentNameOptional() {
		
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> optionalStudent = Optional.ofNullable(null);
		if(optionalStudent.isPresent()) {
			return optionalStudent.map(Student::getName);
		}else {
			return Optional.empty();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getStudentName()!=null?getStudentName():"No student found");
		System.out.println(getStudentNameOptional().isPresent()?getStudentNameOptional().get():"No name found");
	}

}
