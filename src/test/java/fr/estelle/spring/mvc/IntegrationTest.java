package fr.estelle.spring.mvc;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = InitialiseData.class)
@TestPropertySource("classpath:application-test.properties")
public class IntegrationTest {

	@Autowired
	protected WebApplicationContext context;
	@Autowired
	protected JsonHelper jsonHelper;
	protected MockMvc mockMvc;
	
	@Before
	public void initMockMvc() {
		
		
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
}
