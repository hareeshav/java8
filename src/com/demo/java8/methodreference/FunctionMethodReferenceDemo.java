package com.demo.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceDemo {
	
	public static Function<String, String> functionVar = (s) -> s.toUpperCase();
	public static Function<String, String> functionMethodReferenceVar = String :: toUpperCase;
	
	public static void main(String[] args) {
		System.out.println("FunctionMethodReferenceDemo.main()" + functionVar.apply("haReeSh"));
		System.out.println("FunctionMethodReferenceDemo.main()" + functionMethodReferenceVar.apply("haReeSh"));
	}

}
