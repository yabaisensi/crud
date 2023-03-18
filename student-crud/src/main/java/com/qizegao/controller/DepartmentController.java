package com.qizegao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qizegao.dto.DepartmentDto;
import com.qizegao.dto.MsgDto;
import com.qizegao.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	//以JSON的形式返回所有的社团信息
	@RequestMapping("/depts")
	@ResponseBody
	public MsgDto getDepts(){
		//查出的所有部门信息
		List<DepartmentDto> list = departmentService.getDepts();
		return MsgDto.success().add("depts", list);
	}
	
	
	
}
