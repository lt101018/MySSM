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
	public int addStudent(Student student) {
		Student stu = studentMapper.queryStudentByStuno(student.getStuNo());
		if(stu == null) {
			studentMapper.addStudent(student);
			return 1;
		}
		return 0;
	}

	@Override
	public Student queryStudentByNo(int stuno) {
		return studentMapper.queryStudentByStuno(stuno);
	}
	
	@Override
	public int deleteStudentByNo(int stuno) {
		Student student = studentMapper.queryStudentByStuno(stuno);
		if(student != null) {
			studentMapper.deleteStudentByStuno(stuno);
			return 1;
		}
		return 0;
	}

	@Override
	public int updateStudentByNo(Student student) {
		Student stu = studentMapper.queryStudentByStuno(student.getStuNo());
		if(stu != null) {
			studentMapper.updateStudentByStuno(student);
			return 1;
		}
		return 0;
	}

}
