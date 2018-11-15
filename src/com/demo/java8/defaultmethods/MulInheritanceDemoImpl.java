package com.demo.java8.defaultmethods;

public class MulInheritanceDemoImpl implements MulInheritanceDemoInterface1,MulInheritanceDemoInterface2,MulInheritanceDemoInterface3{
	
	public void methodA(){
		System.out.println("MulInheritanceDemoImpl.methodA");
	}
	
	public static void main(String[] args) {
		MulInheritanceDemoImpl impl = new MulInheritanceDemoImpl();
		impl.methodA();
		impl.methodB();
		impl.methodC();
	}

}
