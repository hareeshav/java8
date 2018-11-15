package com.demo.java8.defaultmethods;

public interface MulInheritanceDemoInterface2  extends MulInheritanceDemoInterface1{
	
	default void methodB() {
		System.out.println("MulInheritanceDemoInterface2.methodB");
	}

	default void methodA(){
		System.out.println("MulInheritanceDemoInterface2.methodA");
	}
}
