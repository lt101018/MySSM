package com.tengli.controller;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tengli.entity.Student;
import com.tengli.service.impl.StudentService;

/**
 * Servlet implementation class StudentController
 */
@RequestMapping("controller")
@Controller
public class StudentController{
	
	@Autowired
	@Qualifier("studentService")
	StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("addNewStudent/{stuno}")
	public String addNewStudent(@PathVariable("stuno") Integer stuNo, Map<String,Object> map) {
		Student student = new Student();
		student.setStuAge(100);
		student.setStuName("super");
		student.setStuNo(100);
		studentService.addStudent(student);
		return "result";
	}
	
	@RequestMapping("queryStudentByNo/{stuno}")
	public String queryStudentByNo(@PathVariable("stuno") Integer stuNo, Map<String,Object> map) {
		Student student = studentService.queryStudentByNo(stuNo);
		map.put("student", student);
		return "queryResult";
	}


}
