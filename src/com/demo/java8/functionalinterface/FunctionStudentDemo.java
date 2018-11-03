package com.demo.java8.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.demo.java8.data.Student;
import com.demo.java8.data.StudentDataBase;

public class FunctionStudentDemo {
	
	public static Function<List<Student>, Map<Student, Double>> functionGradeMap = (students -> {
		Map<Student, Double> studentMap = new HashMap<Student, Double>();
		students.forEach(s->{
			//Adding predicate example.
			if(new PredicateAndConsumerDemo().studentGradePredicate.test(s)){
				studentMap.put(s, s.getGpa());
			}
			
		});
		return studentMap;
	});
	
	public static void main(String[] args) {
		Map<Student, Double> studentMap = functionGradeMap.apply(StudentDataBase.getAllStudents());
		System.out.println("FunctionStudentDemo.main()"+studentMap);
	}

}
