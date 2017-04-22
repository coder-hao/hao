package com.ln.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ln.pojo.AdminUser;
import com.ln.service.AdminUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-*.xml", "classpath:spring/springmvc.xml" })
public class AdminTest {

	@Autowired
	private AdminUserService adminUserService;

	@Test
	public void TestSelect() {
		AdminUser adminUser = adminUserService.searchAdminUserById(1);
		System.out.println(adminUser.getUsername());
	}

}
