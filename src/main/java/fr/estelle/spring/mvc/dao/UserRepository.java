package fr.estelle.spring.mvc.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.estelle.spring.mvc.model.User;
import fr.estelle.spring.mvc.dao.AbstractJpaRepository;;

@Transactional
@Repository
public class UserRepository extends AbstractJpaRepository<User> {

	protected UserRepository() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}

	public User findOneByLogin(String login) {
		TypedQuery<User> tq = entityManager.createQuery("FROM User u WHERE u.login=:login", User.class);
		tq.setParameter("login", login);
		return tq.getSingleResult();
	}

	public void deleteAllUsers() {
		getSession().createQuery("delete from User").executeUpdate();

	}
}
