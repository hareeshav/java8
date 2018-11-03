package com.demo.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/*
 * Demonstrates the Supplier Interface
 */
public class SupplierDemo {
	
	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () ->{
			return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
		};
		
		Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents();
		
		System.out.println("SupplierDemo.main()" + studentSupplier.get());
		System.out.println("SupplierDemo.main()" + studentsSupplier.get());
	}

}
