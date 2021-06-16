package com.example.test.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<StudentClass> addStudents(){

        List<StudentClass> studentServiceList=new ArrayList<>();
        studentServiceList.add(new StudentClass(1L,
                "Name",
                "satyakisen1947@gmail.com",
                LocalDate.of(2001,10,12),
                20));
        studentServiceList.add(new StudentClass(1L,
                "Name2",
                "satyakisen1947@gmail.com",
                LocalDate.of(2001,10,12),
                20));
        studentServiceList.add(new StudentClass(1L,
                "Name3",
                "satyakisen1947@gmail.com",
                LocalDate.of(2001,10,12),
                20));
        studentServiceList.add(new StudentClass(1L,
                "Name4",
                "satyakisen1947@gmail.com",
                LocalDate.of(2001,10,12),
                20));
        studentServiceList.add(new StudentClass(1L,
                "Satyaki",
                "satyakisen1947@gmail.com",
                LocalDate.of(2001,10,12),
                20));

        return studentServiceList;
    }

    public List<StudentClass> getStudent(){
        return addStudents();
    }

}
