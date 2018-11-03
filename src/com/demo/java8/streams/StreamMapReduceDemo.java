package com.demo.java8.streams;

import java.util.Optional;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates map-filter-reduce
 * @author hareev
 *
 */
public class StreamMapReduceDemo {
	
	public static Optional<Integer> getNoOfNotebooks() {
		return StudentDataBase.getAllStudents().stream()
				.filter((s)->s.getGpa()>=4)
				.map(Student::getNotebooks)
				//.reduce((a,b)->a+b);
				.reduce(Integer::sum);
	}
	
	public static void main(String[] args) {
		System.out.println(getNoOfNotebooks().isPresent()?getNoOfNotebooks().get():"No notebooks");
	}

}
