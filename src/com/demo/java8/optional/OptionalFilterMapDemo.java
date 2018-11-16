package com.demo.java8.optional;

import java.util.Optional;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates filter,map functions
 * @author hareev
 *
 */
public class OptionalFilterMapDemo {
	
	public static void optionalFilter() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(s->s.getGpa()>=3).ifPresent(s->System.out.println(s));
	}

	public static void optionalFilterMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(s->s.getGpa()>=3).map(Student::getName).ifPresent(s->System.out.println(s));
	}
	
	public static void main(String[] args) {
		optionalFilter();
		optionalFilterMap();
	}

}
