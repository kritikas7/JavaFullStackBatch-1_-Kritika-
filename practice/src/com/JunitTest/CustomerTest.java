package com.JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void test() {
		customer c = new customer();
	//fail("Not yet implemented");
	assertEquals(c.Deposit,5000);
	}

	
	}


