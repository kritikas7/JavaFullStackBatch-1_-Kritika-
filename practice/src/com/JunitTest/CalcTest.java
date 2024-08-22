package com.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {
	Calc c;
	

	@Test
	void testSum() {
		c=new Calc();
		assertEquals(8,c.sum(3, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testDiff() {
		c=new Calc();
		assertEquals(-2,c.diff(3, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testProduct() {
		c=new Calc();
		assertEquals(15,c.product(3, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testDiv() {
		c=new Calc();
		assertEquals(5,c.div(15, 3));
		//fail("Not yet implemented");
	}

}
