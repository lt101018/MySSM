package com.tengli.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tengli.entity.Student;
import com.tengli.service.IStudentService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService studentService = (IStudentService)context.getBean("studentService");
		Student student = new Student();
		student.setStuAge(13);
		student.setStuName("pear");
		student.setStuNo(7);
		studentService.addStudent(student);
	}
}
