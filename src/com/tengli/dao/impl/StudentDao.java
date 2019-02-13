package com.tengli.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tengli.entity.Student;
import com.tengli.mapper.StudentMapper;

public class StudentDao extends SqlSessionDaoSupport implements StudentMapper{

	@Override
	public void addStudent(Student student) {
		SqlSession session = super.getSqlSession();
		StudentMapper stuDao = session.getMapper(StudentMapper.class);
		stuDao.addStudent(student);
	}

}
