package com.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.book.entity.Student;

@Mapper
public interface StudentMapper {
	
	List<Student> findAll();
	
	Student findStudentByID(int id);
	
}
