package com.ln.service;

import java.util.List;
import java.util.Map;

import com.ln.pojo.AdminUser;

public interface AdminUserService {
	AdminUser searchAdminUserById(int id);

	// 测试Proc,查询
	List<AdminUser> testBySelectProc(Map<String, Object> map);

	// 测试Proc,查询
	List<AdminUser> testBySetProc(Map<String, Object> map);
}
