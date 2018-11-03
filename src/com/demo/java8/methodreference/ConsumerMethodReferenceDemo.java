package com.demo.java8.methodreference;

import java.util.Arrays;
import java.util.function.Consumer;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates Consumer Interface using Method Reference
 * 
 * @author hareev
 *
 */
public class ConsumerMethodReferenceDemo {
	static Consumer<Student> consumer = (s)->{System.out.println(s);};
	//using methodreference
	static Consumer<Student> consumerMethodReference = System.out::println;
	
	static Consumer<Student> consumerStudentMethodReference = Student::printListOfActivities;
	
	public static void main(String[] args) {
		consumer.accept(new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball")));
		consumerMethodReference.accept(new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball")));
		StudentDataBase.getAllStudents().forEach(consumer);
		
		consumerStudentMethodReference.accept(new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball")));
	}

}
