package com.demo.java8.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

public class BiConsumerDemo {
	
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a,b) -> {System.out.println(a+"->"+b);};
		biConsumer.accept("welcome", "java8");
		//Multiplication.
		BiConsumer<Integer, Integer> biConsumerMultiply = (a,b) -> {System.out.println(a*b);};
		//Division.
		BiConsumer<Integer, Integer> biConsumerDivide = (a,b) -> {System.out.println(a/b);};
		biConsumerMultiply.andThen(biConsumerDivide).accept(10, 2);
		printNameAndActivities();
	}
	
	public static void printNameAndActivities() {
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> {System.out.println(name+"->"+activities);};
		
		studentList.forEach((student)->{biConsumer.accept(student.getName(), student.getActivities());});
	}

}
