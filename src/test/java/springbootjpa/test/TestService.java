package springbootjpa.test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import springbootjpa.Application;
import springbootjpa.entity.User;
import springbootjpa.service.UserService;


@TestPropertySource(locations = "classpath:application.properties")
@SpringBootTest(classes= {Application.class})
public class TestService {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testSave() {
		User user = new User();
		user.setName("王五");
		assertNotNull(userService.saveUser(user));
		assertNotNull(userService.findById(3));
		
	}
	
	
}
