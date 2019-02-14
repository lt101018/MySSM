package com.tengli.service.impl;

import com.tengli.entity.Student;
import com.tengli.mapper.StudentMapper;
import com.tengli.service.IStudentService;

public class StudentService implements IStudentService {

	private StudentMapper studentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}

	@Override
	public Student queryStudentByNo(int stuno) {
		return studentMapper.queryStudentByStuno(stuno);
	}
	
	@Override
	public Student deleteStudentByNo(int stuno) {
		Student student = studentMapper.queryStudentByStuno(stuno);
		studentMapper.deleteStudentByStuno(stuno);
		return student;
	}

}
