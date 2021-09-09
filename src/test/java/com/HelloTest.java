package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloTest {
	
	Hello hello;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		hello=new Hello();
	}

	@After
	public void tearDown() throws Exception {
		hello=null;
	}

	@Test
	public void testSum1() {
		assertEquals(10, hello.sum(5,5));
	}
	
	@Test
	public void testSum2() {
		assertEquals(25, hello.sum(12,13));
	}
	
	@Test
	public void testSum3() {
		assertEquals(33, hello.sum(21,12));
		;
	}

}
