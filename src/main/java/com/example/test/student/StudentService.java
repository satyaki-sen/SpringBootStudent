package com.example.test.student;

import com.example.test.JdbcConfig;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public StudentService() {

    }

    public List<StudentClass> getAllStudents(){

        return studentDao.selectAllStudents();
    }

    public StudentClass getStudentSelect(Long id){

        return studentDao.selectStudent(id);
    }

    public void addNewStudent(StudentClass studentClass){
        studentDao.insert(studentClass);
        System.out.println(studentClass);
    }

}
