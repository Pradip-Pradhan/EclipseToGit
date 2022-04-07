package com.zensar.junitApp;

public class Addition {

	public Integer add(Integer a, Integer b) {
		return a + b;
	}

	public Integer sub(Integer a, Integer b) {
		return a - b;
	}

	public Integer multi(Integer a, Integer b) {
		return a * b;
	}

	public Integer div(Integer a, Integer b) {
		return a / b;
	}

	public int[] myArray() {
		return new int[] { 1, 2, 3, 4 };
	}

	public String getname(String name) {
		if (name.length() != 0) {
			return name.toUpperCase();
		}
		throw new IllegalArgumentException("error");   
	}
}
