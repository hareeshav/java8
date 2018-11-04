package com.demo.java8.streams;

import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates allMatch(), anyMatch(), noneMatch().
 * 
 * @author hareev
 *
 */
public class StreamsMatchDemo {
	
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream().anyMatch(s->s.getGpa()>=4);
	}
	
	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream().allMatch(s->s.getGpa()>=4);
	}
	
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream().noneMatch(s->s.getGpa()>=4);
	}
	
	public static void main(String[] args) {
		System.out.println(anyMatch());
		System.out.println(allMatch());
		System.out.println(noneMatch());
	}

}
