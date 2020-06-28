package com.expava.gpp.contentmanagement;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.expava.gpp.contentmanagement.controller.ControllerRest;
import com.expava.gpp.contentmanagement.model.User;
import com.expava.gpp.contentmanagement.service.ArticleService;
import com.expava.gpp.contentmanagement.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ControllerRest.class)
public class UserServiceMockMvcTest {

	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private UserService userService;

	@MockBean
	private ArticleService articleService;
	
	@Mock
	User userMock; 

	@Test
	public void getAllUsersAPI() throws Exception
	{
		List<User> users = Arrays.asList(new User("Otto", "Matic"), new User("Tara", "Misu"), new User("Max", "Power"));
		
	    when(userService.getAllUsers()).thenReturn(users);
	    
	  mvc.perform( MockMvcRequestBuilders
	      .get("/rest/allusers")
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk())
//	      .andExpect(MockMvcResultMatchers.jsonPath("$.users").isArray());
	  .andExpect(MockMvcResultMatchers.jsonPath("$.users[*].firstname").isNotEmpty());
	}
}
