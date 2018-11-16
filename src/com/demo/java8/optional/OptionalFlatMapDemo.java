package com.demo.java8.optional;

import java.util.Optional;

import com.demo.java8.data.Bike;
import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates Optional FlatMap.
 * 
 * @author hareev
 *
 */
public class OptionalFlatMapDemo {
	
	public static void flatMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(s->s.getGpa()>3.5).flatMap(Student::getBikes).map(Bike::getName).ifPresent(s->System.out.println(s));
	}
	
	public static void main(String[] args) {
		flatMap();
	}

}
