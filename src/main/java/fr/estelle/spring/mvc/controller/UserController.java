package fr.estelle.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.estelle.spring.mvc.model.User;
import fr.estelle.spring.mvc.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody User user) {
		userService.save(user);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public User findById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	@ResponseBody
	public User update(@PathVariable Long id, @RequestBody User resource) {
		resource.setId(id);
		return userService.update(resource);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public User delete(@PathVariable Long id) {
		return userService.delete(id);
	}

}
