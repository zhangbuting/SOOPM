package com.book.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Student;
import com.book.mapper.StudentMapper;

@Service
public class StudentService {
	
	@Autowired
	StudentMapper studentMapper;
	
	public Student findStudentByID(int id) {
		return studentMapper.findStudentByID(id);
	}
	
	public List<Student> findAll (){
		return studentMapper.findAll();
	}

}
