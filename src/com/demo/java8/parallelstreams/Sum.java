package com.demo.java8.parallelstreams;

/**
 * Sample class to demo parallel stream 
 * @author hareev
 *
 */
public class Sum {
	
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void performSum(int input) {
		total+=input;
	}

}
