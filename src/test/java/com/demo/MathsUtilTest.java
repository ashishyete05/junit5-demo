package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathsUtilTest {

	MathsUtil mathsUtil = null;
	
	@BeforeEach
	void init() {
		System.out.println("Init");
		mathsUtil = new MathsUtil();
	}

	@AfterEach
	public void cleanUp() {
		System.out.println("Cleaning Up..");
	}
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Do something at the start!");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("Do something at the end!");
	}
	
	@Test
	@DisplayName(value = "Testing Add Method")
	void testAdd() {
		int expected = 6;

		int actual = mathsUtil.add(2, 4);
		assertEquals(expected, actual, "This method should add two numbers.");
	}

	@Test
	@Disabled
	void testComputeCircleArea() {
		assertEquals(314.1592653589793, mathsUtil.computeCircleArea(10),
				"This method should return the area of Circle.");
	}

	@Test
	void testHello() {
		String expected = "Hello : Ashish";
		assertEquals(expected, mathsUtil.hello("Ashish"), "This method should return [Hello : Ashish]");
	}

	@Test
	public void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathsUtil.divide(1, 0), " Divide by 0 method");
	}

	



	

	/*
	 * @AfterEach public static void displayAfterEach() {
	 * System.out.println("before All method end"); }
	 */
}
