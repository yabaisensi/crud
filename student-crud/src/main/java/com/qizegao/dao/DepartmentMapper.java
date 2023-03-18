package com.qizegao.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.qizegao.dto.DepartmentDto;
import com.qizegao.dto.DepartmentExampleDto;

public interface DepartmentMapper {
    long countByExample(DepartmentExampleDto example);

    int deleteByExample(DepartmentExampleDto example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(DepartmentDto record);

    int insertSelective(DepartmentDto record);

    List<DepartmentDto> selectByExample(DepartmentExampleDto example);

    DepartmentDto selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") DepartmentDto record, @Param("example") DepartmentExampleDto example);

    int updateByExample(@Param("record") DepartmentDto record, @Param("example") DepartmentExampleDto example);

    int updateByPrimaryKeySelective(DepartmentDto record);

    int updateByPrimaryKey(DepartmentDto record);
}