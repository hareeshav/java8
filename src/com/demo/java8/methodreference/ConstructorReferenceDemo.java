package com.demo.java8.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.demo.java8.data.Student;
/**
 * Demonstrates the COnstructor Reference.
 * @author hareev
 *
 */
public class ConstructorReferenceDemo {
	
	static Supplier<Student> studentSupplier = Student :: new;
	
	static Function<String, Student> functionStudent = Student :: new;
	
	public static void main(String[] args) {
		System.out.println("ConstructorReferenceDemo.main()" + studentSupplier.get());
		
		System.out.println("ConstructorReferenceDemo.main()" + functionStudent.apply("Hareesh"));
	}

}
