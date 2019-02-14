package com.tengli.controller;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("addNewStudent")
	public String addNewStudent(@RequestParam("name") String stuName, @RequestParam("age") int stuAge, @RequestParam("number") int stuNo, Map<String,Object> map) {
		Student student = new Student();
		student.setStuAge(stuAge);
		student.setStuName(stuName);
		student.setStuNo(stuNo);
		studentService.addStudent(student);
		return "addResult";
	}
	
	@RequestMapping(value="queryStudentByNo")
	public String queryStudentByNo(@RequestParam("stuno") Integer stuNo, Map<String,Object> map) {
		Student student = studentService.queryStudentByNo(stuNo);
		map.put("student", student);
		return "queryResult";
	}
	
	@RequestMapping(value="deleteStudentByNo")
	public String deleteStudentByNo(@RequestParam("stuno") Integer stuNo, Map<String,Object> map) {
		Student student = studentService.deleteStudentByNo(stuNo);
		map.put("student", student);
		return "deleteResult";
	}
	
	

}
