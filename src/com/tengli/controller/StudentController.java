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
		int flag = studentService.addStudent(student);
		if(flag == 1) map.put("result","Adding success");
		else map.put("result","Adding failed. Student existed.");
		return "result";
	}
	
	@RequestMapping("updateStudentByNo")
	public String updateStudent(@RequestParam("name") String stuName, @RequestParam("age") int stuAge, @RequestParam("number") int stuNo, Map<String,Object> map) {
		Student student = new Student();
		student.setStuAge(stuAge);
		student.setStuName(stuName);
		student.setStuNo(stuNo);
		int flag = studentService.updateStudentByNo(student);
		if(flag == 1) map.put("result","Updating success");
		else map.put("result","Updating failed. Student not existed.");
		return "result";
	}
	
	@RequestMapping(value="queryStudentByNo")
	public String queryStudentByNo(@RequestParam("stuno") Integer stuNo, Map<String,Object> map) {
		Student student = studentService.queryStudentByNo(stuNo);
		if(student != null) {
			map.put("student", student);
			return "queryResult";
		}
		map.put("result","Querying failed. Student not existed.");
		return "result";
	}
	
	@RequestMapping(value="deleteStudentByNo")
	public String deleteStudentByNo(@RequestParam("stuno") Integer stuNo, Map<String,Object> map) {
		int flag = studentService.deleteStudentByNo(stuNo);
		if(flag == 1) map.put("result","Deleting success");
		else map.put("result","Deleting failed. Student not existed.");
		return "result";
	}
	
	

}
