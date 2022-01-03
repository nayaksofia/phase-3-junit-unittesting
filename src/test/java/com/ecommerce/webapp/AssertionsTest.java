package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionsTest {
	
	String [] arr1 = {"Hi" ,"Gm","Gn", "Hello"};
	String [] arr2 = {"Hi" ,"Gm","Gn", "Hello"};
	String [] arr3 = {"Hi" ,"Gm","Gn", "Hello", "good"};
	
	//Note :: A Test should have a minimum or only one assert statement as a part of test case 

	@Test
	@DisplayName("Assertion Utility Examples : assertTrue")
	void testAssertTrue() {
		
		assertTrue(100>50);
		assertTrue(100<500);
		assertTrue(true);
		assertTrue(true,"assertTrue take a condition output always true");
		//assertFalse(10>50);
		//fail("Not yet implemented");
	}
	
	
	@Test
	@DisplayName("Assertion Utility Examples : assertFalse")
	void testAssertFalse() {
		
		assertFalse(100<50);
		assertFalse(100>500);
		assertFalse(false);
		assertFalse(false,"AssertFalse take a condition output always false");
		
	}
	
	@Test
	@DisplayName("Assertion Utility Examples : assertEqual")
	void testAssertEqual() {
		
		assertEquals(100, 100);
		assertEquals(true, true);
		assertEquals(33.33, 33.33);
		assertEquals("Hello", "Hello");
		assertEquals(100, 100, "Assert Equal Compares Expected Value and Actual Value ");
		
	}

	
	@Test
	@DisplayName("Assertion Utility Examples : assertArrayEqual")
	void testAssertArrayEqual() {
		
		assertArrayEquals(arr1,arr2);
		//assertArrayEquals(arr1,arr3);
	}

	
	@Test
	@DisplayName("Assertion Utility Examples : assertNull , assertNotNull")
	void testAssertNullAndNotNull() {
		
		assertNull(null);
		assertNotNull("I am a string");
	}

	
	@Test
	@DisplayName("Assertion Utility Examples : assertThrows")
	void testAssertThrows() {
		
		assertThrows(RuntimeException.class, ()->{
			
			throw new RuntimeException();
		});
		
	assertThrows(Exception.class, ()->{
			
			throw new Exception();
			
		});
	}
	
  //assertAll() :: Groups many assertions; every assertion is executed even if one or more of them fail


}
