package com.tengli.service;

import com.tengli.entity.Student;

public interface IStudentService {
	public int addStudent(Student student);
	public Student queryStudentByNo(int stuno);
	public Student updateStudentByNo(Student student);
	public int deleteStudentByNo(int stuno);
}
