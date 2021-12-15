package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Of Basic Calculator")
class CalculatorAppTest {

	//Create Instance of CalculatorApp Class
	CalculatorApp app; 
	
	@BeforeEach
	void setUp() throws Exception {
		
		//Create Instance of CalculatorApp Class
		app = new CalculatorApp();
	}

	@AfterEach
	void tearDown() throws Exception {
		
		app = null; //For cleanup activity
	}
	
	
	
	@Test
	@DisplayName("Substraction Test :: Neagative Numbers")
	public void testSubForNegatives() {
		assertEquals(100,app.sub(50, -50));
		assertEquals(-30,app.sub(-10, 20));
		assertEquals(60,app.sub(25, -35));
	}
	
	
	@Test
	@DisplayName("Substraction Test :: Positives Numbers")
	public void testSubForPositives() {
		assertEquals(0,app.sub(50, 50));
		assertEquals(10,app.sub(20, 10));
		assertEquals(0,app.sub(0, 0));
	}
	
	
	
	
	
	@Test
	@DisplayName("Addition Test :: Neagative Numbers")
	public void testAddForNegatives() {
		assertEquals(0,app.add(50, -50));
		assertEquals(10,app.add(-10, 20));
		assertEquals(-10,app.add(25, -35));
	}
	
	

	@Test
	@DisplayName("Addition Test :: Positives Numbers")
	public void testAddForPositives() {
		assertEquals(100, app.add(50, 50));
		assertEquals(0, app.add(0, 0));
		assertEquals(60, app.add(30, 30));
	}
	
	
	@Test
	@DisplayName("Addition Sample Test")
	void testAdd() {
		int output = app.add(100, 100);
		int expected = 200;
		
		//Note:: assertEquals()--> Compare two value, replace the using of if--else
		assertEquals(expected,output); 
		
//		if(output == expected) {
//			
//			System.out.println("Test is Passed !");
//		}else {
//			System.out.println("Test is Failed !");
//		}
		
	}

}
