package com.situ.day15;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void testBefore() {
		System.out.println("before");
	}
	
	@After
	public void testAfter() {
		System.out.println("after");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
