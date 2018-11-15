package com.demo.java8.defaultmethods;

public class MulInheritanceConflictImpl implements MulInheritanceDemoInterface1,MulInheritanceDemoInterface4{

	/**
	 * If this method is not overridden conflict error will be thrown.
	 */
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("MulInheritanceConflictImpl.methodA()");
	}

}
