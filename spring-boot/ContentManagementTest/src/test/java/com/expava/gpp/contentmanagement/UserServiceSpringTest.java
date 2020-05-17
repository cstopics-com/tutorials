package com.expava.gpp.contentmanagement;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.expava.gpp.contentmanagement.model.User;
import com.expava.gpp.contentmanagement.service.UserService;

@SpringBootTest
@TestPropertySource(locations = "/foo.properties")
public class UserServiceSpringTest {

	@Autowired
	private UserService userService;

	static Logger logger = LoggerFactory.getLogger(UserServiceSpringTest.class);

	@BeforeAll
	public static void beforeClass() throws Exception {
		logger.info("beforeClass");
	}

	@AfterAll
	public static void afterClass() throws Exception {
		logger.info("afterClass");
	}

	@BeforeEach
	public void before() throws Exception {
		logger.info("before");
	}

	@AfterEach
	public void after() throws Exception {
		logger.info("after");
	}

	@Value("${foo}")
	String foo;

	@Test
	void test(){
		assertEquals(foo,"bar");
	}

	@Test
	public void testGetAllUsers() {
		List<User> users = userService.getAllUsers();
		assertEquals(3,users.size());
		logger.info("testGetAllUsers done!");
	}
}
