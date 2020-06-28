package com.expava.gpp.contentmanagement;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceJUnit5 {
	static Logger logger = LoggerFactory.getLogger(UserServiceJUnit5.class);

	@BeforeAll
	public static void beforeClass() throws Exception {
		logger.info("beforeAll");
	}

	@AfterAll
	public static void afterClass() throws Exception {
		logger.info("afterAll");
	}

	@BeforeEach
	public void before() throws Exception {
		logger.info("before");
	}

	@AfterEach
	public void after() throws Exception {
		logger.info("after");
	}

	@DisplayName("Single test successful")
	@Test
	public void testA() {
		logger.info("testA done!");
	}

	@Test
	public void testB() {
		assertEquals(3,3);
		logger.info("testB done!");
	}

	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		return Arrays.asList(
				dynamicTest("simple dynamic test", () -> assertTrue(true)),
				dynamicTest("My Executable Class", new MyExecutable()),
				dynamicTest("Exception Executable", () -> {throw new Exception("Exception Example");}),
				dynamicTest("simple dynamic test-2", () -> assertTrue(true)));
	}
}

class MyExecutable implements Executable {

	@Override
	public void execute() throws Throwable {
		System.out.println("Hello World!");
	}
}
