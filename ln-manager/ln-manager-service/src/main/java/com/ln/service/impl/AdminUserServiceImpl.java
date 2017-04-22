package com.ln.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ln.mapper.AdminUserMapper;
import com.ln.pojo.AdminUser;
import com.ln.pojo.AdminUserExample;
import com.ln.pojo.AdminUserExample.Criteria;
import com.ln.service.AdminUserService;

@Service
public class AdminUserServiceImpl implements AdminUserService {

	@Autowired
	private AdminUserMapper adminUserMapper;

	@Override
	public AdminUser searchAdminUserById(int id) {
		// AdminUser adminUser = adminUserMapper.selectByPrimaryKey(id);

		AdminUserExample example = new AdminUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<AdminUser> listAdminUser = adminUserMapper.selectByExample(example);
		if (listAdminUser != null && listAdminUser.size() > 0) {
			return listAdminUser.get(0);
		}
		return null;
	}

	public List<AdminUser> testBySelectProc(Map<String, Object> map) {
		return adminUserMapper.testBySelectProc(map);
	}

	public List<AdminUser> testBySetProc(Map<String, Object> map) {
		return adminUserMapper.testBySetProc(map);
	}
}
