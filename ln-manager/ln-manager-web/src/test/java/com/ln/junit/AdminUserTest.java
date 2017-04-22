package com.ln.junit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.ln.pojo.AdminUser;
import com.ln.service.AdminUserService;

public class AdminUserTest extends BaseTest {

	public void testSelect() {
		AdminUserService adminUserService = (AdminUserService) super.setUp().getBean("adminUserServiceImpl");
		AdminUser adminUser = adminUserService.searchAdminUserById(1);
		System.out.println(adminUser.getUsername());
	}

	// 测试存储过程
	// 需要先在sql中创建存储过程，语句在/ln-manager-web/WebRoot/html/tool/data/proc.sql这里
	// 查询语句，只有输入参数，没有输出参数和return参数
	@Test
	public void testSelectProc() {

		AdminUserService adminUserService = (AdminUserService) super.setUp().getBean("adminUserServiceImpl");
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", 1);
		paramMap.put("isRstriction", 0);
		List<AdminUser> list = adminUserService.testBySelectProc(paramMap);
		System.out.println(list.get(0).getUsername());
	}

	// 测试存储过程
	// 需要先在sql中创建存储过程，语句在/ln-manager-web/WebRoot/html/tool/data/proc.sql这里
	// 查询语句，有输入参数、输出参数、return参数
	public void testSetProc() {
		AdminUserService adminUserService = (AdminUserService) super.setUp().getBean("adminUserServiceImpl");
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", 1);
		paramMap.put("isRstriction", 1);
		List<AdminUser> list = adminUserService.testBySetProc(paramMap);
		System.out.println(list.size());
		System.out.println(paramMap.get("setValue"));
		System.out.println(paramMap.get("returnValue"));
	}
}
