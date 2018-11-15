package com.demo.java8.defaultmethods;

public interface MulInheritanceDemoInterface3  extends MulInheritanceDemoInterface2 {
	
	default void methodC() {
		System.out.println("MulInheritanceDemoInterface3.methodC");
	}

}
