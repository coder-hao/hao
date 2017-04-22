package com.ln.mapper;

import com.ln.pojo.AdminRoleDept;
import com.ln.pojo.AdminRoleDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleDeptMapper {
    int countByExample(AdminRoleDeptExample example);

    int deleteByExample(AdminRoleDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminRoleDept record);

    int insertSelective(AdminRoleDept record);

    List<AdminRoleDept> selectByExample(AdminRoleDeptExample example);

    AdminRoleDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminRoleDept record, @Param("example") AdminRoleDeptExample example);

    int updateByExample(@Param("record") AdminRoleDept record, @Param("example") AdminRoleDeptExample example);

    int updateByPrimaryKeySelective(AdminRoleDept record);

    int updateByPrimaryKey(AdminRoleDept record);
}