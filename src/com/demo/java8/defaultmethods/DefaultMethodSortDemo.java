package com.demo.java8.defaultmethods;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

/**
 * Demonstrates sort() method
 * @author hareev
 *
 */
public class DefaultMethodSortDemo {
	
	static Consumer<Student> studentConsumer = (s->System.out.println(s));
	static Comparator<Student> studentNameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> studentGpaComparator = Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> studentGradeComparator = Comparator.comparingInt(Student::getGradeLevel);
	
	public static void sortByName(List<Student> studentList) {
		System.out.println("DefaultMethodSortDemo.sortByName()");
		
		studentList.sort(studentNameComparator);
		studentList.forEach(studentConsumer);
		
	}
	
	public static void sortByGpa(List<Student> studentList) {
		System.out.println("DefaultMethodSortDemo.sortByGpa()");
		studentList.sort(studentGpaComparator);
		studentList.forEach(studentConsumer);
		
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		System.out.println("DefaultMethodSortDemo.comparatorChaining()");
		studentList.sort(studentGradeComparator.thenComparing(studentNameComparator));
		studentList.forEach(studentConsumer);
		
	}
	
	public static void nullSort(List<Student> studentList) {
		System.out.println("DefaultMethodSortDemo.nullSort()");
		Comparator<Student> studentNameNullComparator = Comparator.nullsLast(studentNameComparator);
		studentList.sort(studentNameNullComparator);
		studentList.forEach(studentConsumer);
		
	}
	
	public static void main(String[] args) {
		System.out.println("DefaultMethodSortDemo.main()");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(studentConsumer);
		//sortByName(studentList);
		//sortByGpa(studentList);
		//comparatorChaining(studentList);
		nullSort(studentList);
	}

}
