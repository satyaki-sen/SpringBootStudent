package com.example.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/home")
    public String getHome(){
        return "Hey Welcome to Home";
    }

    @PostMapping("/NewStudent")
    public void registerNewStudent(@RequestBody StudentClass studentClass){
        studentService.addNewStudent(studentClass);
    }

    @GetMapping("/student/{id}")
    public StudentClass getStudentSearch(@PathVariable(value = "id") Long userId){

        return studentService.getStudentSelect(userId);
    }

    @GetMapping("/AllStudents")
    public List<StudentClass> getAllStudents(){

        return studentService.getAllStudents();
    }

}
