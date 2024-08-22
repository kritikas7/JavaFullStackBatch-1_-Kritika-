package com.JunitTest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest2 {
 Calc c;
 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Testing started");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Testing Ended");
	}

	@BeforeEach
	void setUp() throws Exception {
		c=new Calc();
		System.out.println("Started for each case");
	}

	@AfterEach
	void tearDown() throws Exception {
		c=null;
		System.out.println("Ended for each case");
		
	}

	@Test
	void testSum() {
		assertEquals(6,c.sum(2,4));
		//fail("Not yet implemented");
	}

	@Test
	void testDiff() {
		assertEquals(-2,c.diff(2,4));
		//fail("Not yet implemented");
	}

	@Test
	void testProduct() {
		assertEquals(8,c.product(2,4));
		//fail("Not yet implemented");
	}

	@Test
	void testDiv() {
		assertEquals(11,c.sum(2,4));
		//fail("Not yet implemented");
	}

}
