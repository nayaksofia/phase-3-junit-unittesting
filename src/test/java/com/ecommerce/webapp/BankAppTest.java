package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAppTest {
	
	BankApp app;

	@BeforeEach
	void setUp() throws Exception {
		
		app = new BankApp();
	}

	@AfterEach
	void tearDown() throws Exception {
		
		app = null;
	}

	@Test
	@DisplayName("Bank Test :: Show Balance Test")
	void testShowBalance() {
		
		assertEquals(3000,app.showBalance());
		app.depositeAmount(3000);
		assertEquals(6000,app.showBalance());
	}
	
	@Test
	@DisplayName("Bank Test :: Deposite Balance Test")
	void testDeposite() {				
	assertEquals(6000,app.depositeAmount(3000));
	}
	
	@Test
	@DisplayName("Bank Test :: Negative Deposite Amount Test")
	void testDepositeNegative() {				
	assertEquals(-1,app.depositeAmount(-3000));
	assertEquals(3000,app.showBalance());
	}
	

}
