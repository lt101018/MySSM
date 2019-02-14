package com.tengli.service;

import com.tengli.entity.Student;

public interface IStudentService {
	public void addStudent(Student student);
	public Student queryStudentByNo(int stuno);
	public Student updateStudentByNo(Student student);
	public Student deleteStudentByNo(int stuno);
}
