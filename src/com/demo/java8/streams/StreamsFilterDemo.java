package com.demo.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates filter()
 * @author hareev
 *
 */
public class StreamsFilterDemo {
	
	  public static List<Student> filterStudents(){

	        List<Student> filteredStudentList = StudentDataBase.getAllStudents()
	                .stream()
	                .filter(student -> student.getGpa()>=3.9)
	                .filter(student -> student.getGender().equals("female"))
	                .collect(Collectors.toList());

	        return filteredStudentList;
	    }

	    public static void main(String[] args) {

	        System.out.println("Filtered Students : " + filterStudents());

	    }

}
