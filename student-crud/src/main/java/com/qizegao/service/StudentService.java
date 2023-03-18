package com.qizegao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qizegao.dao.StudentMapper;
import com.qizegao.dto.StudentDto;
import com.qizegao.dto.StudentExampleDto;
import com.qizegao.dto.StudentExampleDto.Criteria;

@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;
	
	//查询所有学生
	public List<StudentDto> getAll() {
		//创建Example类定义查询条件
		StudentExampleDto studentExample = new StudentExampleDto();
		studentExample.setOrderByClause("stu_id asc");
		return studentMapper.selectByExampleWithDept(studentExample);
	}
	
	//校验用户名是否已经存在于数据库
	public boolean checkUser(String stuName) {
		//指定条件的查询
		StudentExampleDto example = new StudentExampleDto();
		Criteria criteria = example.createCriteria();
		criteria.andStuNameEqualTo(stuName);
		long count = studentMapper.countByExample(example);
		return count == 0;
	}
	
	//保存学生
	public void saveStu(StudentDto student) {
		studentMapper.insertSelective(student); //MBG生成的方法
	}
	
	//根据id查询学生信息
	public StudentDto getStu(Integer id) {
		StudentDto student = studentMapper.selectByPrimaryKey(id);
		return student;
	}
	
	//保存更新后的学生的信息
	public void updateStu(StudentDto student) {
		studentMapper.updateByPrimaryKeySelective(student);
	}
	
	//单个删除
	public void deleteStu(Integer id) {
		studentMapper.deleteByPrimaryKey(id);
	}
	
	//批量删除
	public void deleteBatch(List<Integer> ids) {
		StudentExampleDto studentExample = new StudentExampleDto();
		Criteria criteria = studentExample.createCriteria();
		
		//delete from tbl_stu where stu_id in(1,2,3...) 
		criteria.andStuIdIn(ids);
		
		studentMapper.deleteByExample(studentExample);
	}
}

