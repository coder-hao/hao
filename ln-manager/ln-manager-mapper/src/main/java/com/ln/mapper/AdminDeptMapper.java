package com.ln.mapper;

import com.ln.pojo.AdminDept;
import com.ln.pojo.AdminDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminDeptMapper {
    int countByExample(AdminDeptExample example);

    int deleteByExample(AdminDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminDept record);

    int insertSelective(AdminDept record);

    List<AdminDept> selectByExample(AdminDeptExample example);

    AdminDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminDept record, @Param("example") AdminDeptExample example);

    int updateByExample(@Param("record") AdminDept record, @Param("example") AdminDeptExample example);

    int updateByPrimaryKeySelective(AdminDept record);

    int updateByPrimaryKey(AdminDept record);
}