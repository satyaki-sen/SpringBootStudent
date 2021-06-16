package com.example.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService service){
        this.studentService=service;
    }

    @GetMapping("/student")
    public List<StudentClass> getStudent(){
        return studentService.getStudent();
    }

    @GetMapping("/home")
    public String getHome(){
        return "Hey Welcome to Home";
    }

}
