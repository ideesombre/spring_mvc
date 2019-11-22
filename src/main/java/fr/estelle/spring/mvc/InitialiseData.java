package fr.estelle.spring.mvc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import fr.estelle.spring.mvc.model.User;
import fr.estelle.spring.mvc.service.UserService;

@Component
//@ComponentScan
//@EnableTransactionManagement
public class InitialiseData {
	
	@Autowired
	private UserService userService;
	
	@PostConstruct
	public void initialiseData() {
//				
//		userService.save(new User("login","password", "name"));
//		userService.save(new User("login1","password1", "name1"));
//		userService.save(new User("login2","password2", "name2"));
//		userService.save(new User("login3","password3", "name3"));
	}
}
