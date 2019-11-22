package fr.estelle.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.estelle.spring.mvc.dao.UserRepository;
import fr.estelle.spring.mvc.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User findOnByLogin(String login) {
		return userRepository.findOneByLogin(login);
	}

	@Transactional
	public User save(User user) {
		return userRepository.save(user);

	}

	public User update(User user) {
		return userRepository.update(user);
	}

	public User findById(Long id) {
		return userRepository.find(id);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User delete(Long id) {
		return userRepository.delete(id);
	}

	public void deleteAllUsers() {
		userRepository.deleteAllUsers();

	}
}
