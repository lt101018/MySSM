package com.tengli.service;

import com.tengli.entity.Student;

public interface IStudentService {
	public void addStudent(Student student);
	public Student queryStudentByNo(int stuno);
}
