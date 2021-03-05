package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Student;
import com.book.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
	private StudentService studentService;
    @GetMapping
    public String findAll(Model model){

    	List<Student> studentList =studentService.findAll();
    	
    	model.addAttribute("students", studentList);
    	
    	for (Student student : studentList) {
			System.out.println(student.toString());
		}
    return "students";
    }
    
	@GetMapping("/{id}")
	public String findStudentByID(@PathVariable int id) {

		return studentService.findStudentByID(id).toString();
	}
}
