package com.qizegao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qizegao.dao.DepartmentMapper;
import com.qizegao.dto.DepartmentDto;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	//查询所有社团
	public List<DepartmentDto> getDepts() {
		List<DepartmentDto> list = departmentMapper.selectByExample(null);
		return list;
	}
}
