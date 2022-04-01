package com.demo;

public class MathsUtil {

	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public double computeCircleArea(double d) {

		return Math.PI * d * d;
	}

	public String hello(String message) {
		return "Hello : " + message;
	}
}
