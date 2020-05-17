package com.expava.gpp.contentmanagement;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.springframework.boot.test.context.SpringBootTest;

import com.expava.gpp.contentmanagement.model.User;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class UserServiceMockitoTestAnno {

	 @Mock
	 User userMock; 

	 @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 
	    
	@Test
	public void testUser() {
		when(userMock.getFirstname()).thenReturn("Richard");
		String firstname = userMock.getFirstname();
		assertEquals(firstname,"Richard");
	}
}
