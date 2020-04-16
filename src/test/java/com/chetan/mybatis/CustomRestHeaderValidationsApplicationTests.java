package com.chetan.mybatis;

import com.chetan.mybatis.business.Customer;
import com.chetan.mybatis.integration.CustomerDaoMyBatisImpl;
import com.chetan.mybatis.integration.CustomerMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
@Transactional
class CustomRestHeaderValidationsApplicationTests {

	@Autowired
	CustomerDaoMyBatisImpl customerDao;

	@Test
	void testMapperNotNull() {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:beans.xml");
		CustomerMapper mapper = context.getBean(CustomerMapper.class);
		assertNotNull(mapper);
		context.close();
	}

	@Test
	void testGetAllCustomers() {
		List<Customer> customers = customerDao.getAllCustomers();
		assertNotNull(customers);
		assertEquals(2, customers.size());
	}

}