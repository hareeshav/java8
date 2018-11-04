package com.demo.java8.streams;

import java.util.Optional;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

public class StreamsFindDemo {
	
	public static Optional<Student> findFirst(){
		return StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=4.9).findFirst();
	}
	
	public static Optional<Student> findAny(){
		return StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=3.5).findAny();
	}
	
	public static void main(String[] args) {
		Optional<Student> result = findFirst();
		System.out.println(result.isPresent() ? result.get():"No results");
		
		Optional<Student> result1 = findAny();
		System.out.println(result1.isPresent() ? result1.get():"No results");
	}

}
