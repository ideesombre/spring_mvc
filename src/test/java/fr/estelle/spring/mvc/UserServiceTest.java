package fr.estelle.spring.mvc;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.hql.internal.ast.tree.IsNotNullLogicOperatorNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import fr.estelle.spring.mvc.dao.UserRepository;
import fr.estelle.spring.mvc.model.User;
import fr.estelle.spring.mvc.service.UserService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(classes = InitialiseData.class)
//@Transactional
public class UserServiceTest {
//	@Autowired
//	private WebApplicationContext context;
//
//	@Autowired
//	private UserRepository userRepository;
//
//	private List<User> users;
//
//	@Test
//	@Ignore
//	public void testApp() {
//		try {
//
//			/* Clean */
//			userRepository.deleteAllUsers();
//
//			UserService service = (UserService) context.getBean("userService");
//
//			/*
//			 * Create User1
//			 */
//			User user1 = new User();
//			user1.setLogin("login user1");
//			user1.setPassword("password user1");
//			user1.setName("name user1");
//
//			/*
//			 * Create User1
//			 */
//			User user2 = new User();
//			user2.setLogin("login user2");
//			user2.setPassword("password user2");
//			user2.setName("name user2");
//
//			/*
//			 * Persist both Employees
//			 */
//			service.save(user1);
//			service.save(user2);
//
//			/*
//			 * Get all users list from database
//			 */
//			List<User> users = service.findAll();
//			users.forEach(System.out::println);
//
//			System.out.println("---");
//			userRepository.deleteAllUsers();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Before
//	public void createList() {
//
//		userRepository.save(new User("login1", "password1", "name1"));
//		userRepository.save(new User("login2", "password2", "name2"));
//		userRepository.save(new User("login3", "password3", "name3"));
//		userRepository.save(new User("login4", "password4", "name4"));
//
//	}
//
//	@Test
//	public void findOneByLoginTest_OK() {
//		User user2 = userRepository.findOneByLogin("login2");
//		assertEquals(new User(2L, "login2", "password2", "name2"), user2);
//	}
//
//	@Test
//	public void saveTest_OK() {
//		User userTest = new User("loginTest", "passwordTest", "test");
//		User result = userRepository.save(userTest);
//		System.out.println(result.getId());
//		Assert.assertNotNull(result.getId());
//	}

//	@Test
//	public void findOneByLoginTest_null() {
//		userRepository.findOneByLogin(null).toString();
//		
//	}

}