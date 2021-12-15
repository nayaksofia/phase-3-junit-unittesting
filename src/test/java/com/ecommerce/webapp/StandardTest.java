package com.ecommerce.webapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Standard Test With Annotations.")
public class StandardTest {
	
	@BeforeAll
	static void setUpAll() {
		System.out.println("------Before All !!!--------\n");
	}
	

	@AfterAll
	static void cleanAll() {
		System.out.println("------After All !!!--------\n");
	}
	
	@BeforeEach
	public void setUpForEach() {
		System.out.println("--------Before Each !!!!!---------");
	}
	
	@AfterEach
	public void cleanUpAfterEachTest() {
		
		System.out.println("--------After Each Test !!!!!--------\n\n");
	}
	
	@Test
	@DisplayName("First Test Junit As testOne")
	public void testOne() {
		
		System.out.println("  Test 1 is execuited !  ");
		
	}

	@Test
	@DisplayName("Second Test Junit As testTwo")
	public void testTwo() {
		
		System.out.println("  Test 2 is executed !  ");
	}

}
