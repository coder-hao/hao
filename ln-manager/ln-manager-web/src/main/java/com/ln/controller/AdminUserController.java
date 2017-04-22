package com.ln.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ln.pojo.AdminUser;
import com.ln.service.AdminUserService;

@Controller
public class AdminUserController {
	@Autowired
	private AdminUserService adminUserService;

	@RequestMapping("/queryAdminUserById/{id}")
	@ResponseBody
	public AdminUser queryAdminUserById(@PathVariable int id) {
		AdminUser adminUser = adminUserService.searchAdminUserById(id);
		return adminUser;
	}

}
