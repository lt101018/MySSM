package com.tengli.mapper;

import com.tengli.entity.Student;

public interface StudentMapper {
	public void addStudent(Student student);
	public Student queryStudentByStuno(int stuNo);
	public Student deleteStudentByStuno(int stuNo);
}
