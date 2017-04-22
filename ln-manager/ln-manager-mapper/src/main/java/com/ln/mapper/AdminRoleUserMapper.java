package com.ln.mapper;

import com.ln.pojo.AdminRoleUser;
import com.ln.pojo.AdminRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleUserMapper {
    int countByExample(AdminRoleUserExample example);

    int deleteByExample(AdminRoleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRoleUser record);

    int insertSelective(AdminRoleUser record);

    List<AdminRoleUser> selectByExample(AdminRoleUserExample example);

    AdminRoleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRoleUser record, @Param("example") AdminRoleUserExample example);

    int updateByExample(@Param("record") AdminRoleUser record, @Param("example") AdminRoleUserExample example);

    int updateByPrimaryKeySelective(AdminRoleUser record);

    int updateByPrimaryKey(AdminRoleUser record);
}