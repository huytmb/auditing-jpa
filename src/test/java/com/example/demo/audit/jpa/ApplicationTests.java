package com.example.demo.audit.jpa;

import com.example.demo.audit.jpa.entity.A;
import com.example.demo.audit.jpa.entity.B;
import com.example.demo.audit.jpa.repository.ARepository;
import com.example.demo.audit.jpa.repository.BRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

	@Autowired
	private ARepository aRepository;

	@Autowired
	private BRepository bRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testARepository() {

		A a = new A();
		a.setId(1);
		a.setName("A");
		a.setContent("Hello");

		A saved = aRepository.save(a);

		logger.info(String.valueOf(saved.getCreatedBy()));

	}

	@Test
	public void testBRepository() {

		B b = new B();
		b.setId(1);
		b.setName("B");
		b.setContent("Hello");

		B saved = bRepository.save(b);

		logger.info(String.valueOf(saved.getCreatedBy()));

	}

}
