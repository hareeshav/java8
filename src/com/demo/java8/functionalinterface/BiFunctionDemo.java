package com.demo.java8.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

public class BiFunctionDemo {
	
	public static BiFunction<List<Student>, Predicate<Student>, Map<Student, Double>> biFunctionVar = ((students, studentPredicate)->{
		
		Map<Student, Double> studentMap = new HashMap();
		
		students.forEach((s)->{
			if(studentPredicate.test(s)) {
				studentMap.put(s, s.getGpa());
			}
		});
		
		return studentMap;
	});
	
	public static void main(String[] args) {
		//System.out.println("BiFunctionDemo.main()"+biFunctionVar.apply(StudentDataBase.getAllStudents(), new PredicateAndConsumerDemo().studentGradePredicate));
		System.out.println("BiFunctionDemo.main()"+biFunctionVar.apply(StudentDataBase.getAllStudents(), new PredicateAndConsumerDemo().studentGpaPredicate));
	}

}
