package fr.estelle.spring.mvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.transaction.annotation.Transactional;

import fr.estelle.spring.mvc.model.User;
import fr.estelle.spring.mvc.service.UserService;

@Transactional
@Sql("classpath:test-user-data.sql")
public class UserIntegrationTest extends IntegrationTest {

	@Autowired
	UserService userService;


//	@Test
//	
//	public void testCreate() throws Exception {
//		User u = new User("test", "test", "test");
//		u.setLogin("update");
//		/*
//		 * perform(post...) va faire un post sur l'url .../api/users
//		 * contentType dit que la requete est en JSON
//		 * characterEncoding encode en UTF-8
//		 * content va transformer l'ojbjet en JSON { " \"login\" : \"test\"
//		 * 																etc}
//		 * andExpect(status().isCreated() s'attend au code 200
//		 */
//		this.mockMvc.perform(post("/api/users").contentType(MediaType.APPLICATION_JSON).characterEncoding("UTF-8")
//				.content(jsonHelper.serialize(u))).andExpect(status().isCreated());
//		/*
//		 * perform(get...) va faire un get sur l'url .../api/users
//		 * andDo va imprimer le resultat du get et le corps de la requete
//		 * andExpect(jsonPath("$", hasSize(3) va verifier qu'il n'y a bien que 3 elements
//		 * andExpect(status().isOk() s'attend au code 200
//		 */
//		this.mockMvc.perform(get("/api/users")).andDo(MockMvcResultHandlers.print())
//				.andExpect(jsonPath("$", hasSize(3))).andExpect(status().isOk());
//	}

	@Test
	public void testUpdate() throws Exception {
		User user = userService.findById(1l);
		Assert.assertEquals("admin@iocean.fr", user.getLogin());

		user.setLogin("test@iocean.fr");
//		this.mockMvc.perform(get("/api/users/1")).andDo(MockMvcResultHandlers.print());
		this.mockMvc
				.perform(put("/api/users/{id}", 1).contentType(MediaType.APPLICATION_JSON).characterEncoding("UTF-8")
						.content(jsonHelper.serialize(user))).andDo(MockMvcResultHandlers.print())
				.andExpect(jsonPath("$.login",Is.is("test@iocean.fr"))).andExpect(status().isOk());
	}

//	@Test
//	public void testGetUser() throws Exception {
//		this.mockMvc.perform(get("/api/users/{id}", 1)).andDo(MockMvcResultHandlers.print())
//				.andExpect(jsonPath("$.id").value(1)).andExpect(jsonPath("$.login").value("admin@iocean.fr"))
//				.andExpect(status().isOk());
//	}
//
//	@Test
//	public void testGetNotFoundUser() throws Exception {
//		this.mockMvc.perform(get("/api/users/{id}", 55)).andDo(MockMvcResultHandlers.print())
//				.andExpect(status().isNotFound());
//	}
//	
//	@Test
//	public void testGetAllUsers() throws Exception {
//		this.mockMvc.perform(get("/api/users")).andDo(MockMvcResultHandlers.print())
//				.andExpect(jsonPath("$", hasSize(2))).andExpect(status().isOk());
//	}

}
