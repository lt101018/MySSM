package com.tengli.service;

import com.tengli.entity.Student;

public interface IStudentService {
	public int addStudent(Student student);
	public Student queryStudentByNo(int stuno);
	public int updateStudentByNo(Student student);
	public int deleteStudentByNo(int stuno);
}
