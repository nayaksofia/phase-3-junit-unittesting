package com.ecommerce.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@EnabledOnOs({OS.WINDOWS})
	@RepeatedTest(value=2)
	@DisplayName("Test : Runs Only On Windows")
	void testForWindowsOS() {
		
		System.out.println("----This Test Run Only In Windows----");
		assertTrue(true);
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	@DisplayName("Test : Runs Only On Linux OS")
	void testForLinuxOS() {
		
		System.out.println("----This Test Run Only In Linux OS----");
		assertTrue(true);
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	@DisplayName("Test : Runs Only On JRE 8")
	void testForJava8() {
		
		System.out.println("----This Test Run Only On JRE 8----");
		assertTrue(true);
	}

	@Test
	@DisabledOnJre(JRE.JAVA_8)
	@DisplayName("Test : Runs Only If Not JRE 8")
	void testForNotJava8() {
		
		System.out.println("----This Test Run Only If Not JRE 8----");
		assertTrue(true);
	}

	@Test
	@EnabledOnJre(JRE.JAVA_11)
	@DisplayName("Test : Runs Only On JRE 11")
	void testForJava11() {
		
		System.out.println("----This Test Run Only On JRE 11----");
		assertTrue(true);
	}
 
//	@Test
//	@DisabledIf("Math.random() < 0.3141")
//	@DisplayName("Test : On Some Random Number")
//	void testForRandomNumber() {
//		
//		System.out.println("----This may or may not executed----");
//		assertTrue(true);
//	}

}
