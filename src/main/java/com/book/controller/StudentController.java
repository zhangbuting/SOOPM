package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Student;
import com.book.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
	private StudentService studentService;
    
    public String findAll(){
    	List<Student> studentList =studentService.findAll();
    	
    	String s="";
    	for (Student student : studentList) {
			s+=student.toString();
		}
    return s;
    }
    
	@GetMapping("/{id}")
	public String findStudentByID(@PathVariable int id) {

		return studentService.findStudentByID(id).toString();
	}
}
