package com.expava.gpp.contentmanagement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.expava.gpp.contentmanagement.model.User;
import com.expava.gpp.contentmanagement.service.UserService;
import com.expava.gpp.contentmanagement.service.UserServiceImpl;


public class UserServiceJUnit4 {

	static Logger logger = LoggerFactory.getLogger(UserServiceJUnit4.class);
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		logger.info("beforeClass");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		logger.info("afterClass");
	}

	@Before
	public void before() throws Exception {
		logger.info("before");
	}

	@After
	public void after() throws Exception {
		logger.info("after");
	}
	
	@Test
	public void testA() {
		assertTrue(true);
		logger.info("testA done!");
	}

	@Test
	public void testB() {
		assertEquals(3,3);
		logger.info("testB done!");
	}
	
	@Test(timeout=10) 
	public void testC() {
		assertEquals(3,3);
		for(int i=1;i<1000000;i++) {
			String test= String.valueOf(i);
		}
		logger.info("testC done!");
	}
	
	@Test(expected = Exception.class)  
	public void testD() {
		logger.info("testD throw Exception!");
		throw new RuntimeException("Error testing");
	}
	
	@Ignore("Need to be updated")
	@Test
	public void testE() {
		assertEquals(3,3);
		logger.info("testE done!");
	}
	
	@Test
	public void testF() {
		fail("TEST failed");
	}
	
	@Test
	public void testGetAllUsers() {
		UserService userService = new UserServiceImpl();
		List<User> users = userService.getAllUsers();
		assertEquals(3,users.size());
		logger.info("testGetAllUsers done!");
	}

}
