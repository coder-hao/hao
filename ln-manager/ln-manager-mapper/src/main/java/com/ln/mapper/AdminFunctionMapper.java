package com.ln.mapper;

import com.ln.pojo.AdminFunction;
import com.ln.pojo.AdminFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminFunctionMapper {
    int countByExample(AdminFunctionExample example);

    int deleteByExample(AdminFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminFunction record);

    int insertSelective(AdminFunction record);

    List<AdminFunction> selectByExample(AdminFunctionExample example);

    AdminFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminFunction record, @Param("example") AdminFunctionExample example);

    int updateByExample(@Param("record") AdminFunction record, @Param("example") AdminFunctionExample example);

    int updateByPrimaryKeySelective(AdminFunction record);

    int updateByPrimaryKey(AdminFunction record);
}