package com.example.test.student;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {

    public int insert(StudentClass student);

    public StudentClass selectStudent(Long id);

    public List<StudentClass> selectAllStudents();

}
