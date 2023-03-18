package com.qizegao.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.qizegao.dto.StudentDto;
import com.qizegao.dto.StudentExampleDto;

public interface StudentMapper {
    long countByExample(StudentExampleDto example);

    int deleteByExample(StudentExampleDto example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(StudentDto record);

    int insertSelective(StudentDto record);

    List<StudentDto> selectByExample(StudentExampleDto example);

    StudentDto selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") StudentDto record, @Param("example") StudentExampleDto example);

    int updateByExample(@Param("record") StudentDto record, @Param("example") StudentExampleDto example);

    int updateByPrimaryKeySelective(StudentDto record);

    int updateByPrimaryKey(StudentDto record);
    
    List<StudentDto> selectByExampleWithDept(StudentExampleDto example);

    StudentDto selectByPrimaryKeyWithDept(Integer stuId);
}