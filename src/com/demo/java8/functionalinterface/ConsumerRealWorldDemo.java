package com.demo.java8.functionalinterface;

import java.util.List;
import java.util.function.Consumer;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates real word usage of Consumer functional interface.
 * 
 * @author hareev
 *
 */
public class ConsumerRealWorldDemo {
	
	static Consumer<Student> studentConsumer = (s) -> System.out.println(s);
	static Consumer<Student> studentConsumer1 = (s) -> System.out.print(s.getName());
	static Consumer<Student> studentConsumer2 = (s) -> System.out.println(s.getActivities());
	static List<Student> students = StudentDataBase.getAllStudents();
	
	public static void printStudent() {
		
		//Print all students.
		students.forEach(studentConsumer);
		
	}
	
	public static void printNameAndActivities() {
		
		//Print all students.
		students.forEach(studentConsumer1.andThen(studentConsumer2));//Consumer Chaining
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		System.out.println("ConsumerRealWorldDemo.printNameAndActivitiesUsingCondition()");
		//Print all students.
		students.forEach((student)->{
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				studentConsumer1.andThen(studentConsumer2).accept(student);
			}
		});//InLine lambda
	}
	
	public static void main(String[] args) {
		
		printStudent();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
		
	}

}
