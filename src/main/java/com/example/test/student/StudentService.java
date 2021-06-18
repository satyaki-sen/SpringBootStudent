package com.example.test.student;

import com.example.test.JdbcConfig;
import org.apache.commons.logging.Log;
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

    private ApplicationContext context;
    private StudentDao studentDao;

    public StudentService() {

        context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        studentDao=context.getBean("studentDao",StudentDao.class);

    }

    //public List<StudentClass> getStudent(){
        //return addStudents();
    //}

    public void addNewStudent(StudentClass studentClass){

        studentDao.insert(studentClass);
        System.out.println(studentClass);
    }

}
