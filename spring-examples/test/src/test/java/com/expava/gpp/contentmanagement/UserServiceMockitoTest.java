package com.expava.gpp.contentmanagement;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.expava.gpp.contentmanagement.model.User;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class UserServiceMockitoTest {

	@Test
	public void testUser() {
		User userMock = mock(User.class);
		when(userMock.getFirstname()).thenReturn("Richard");
		String firstname = userMock.getFirstname();
		assertEquals(firstname,"Richard");
	}
}
