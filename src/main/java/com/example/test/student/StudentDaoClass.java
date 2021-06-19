package com.example.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoClass implements StudentDao{

    @Autowired
    private JdbcTemplate jdbctemplate;
    private List<StudentClass> selectRes;

    @Override
    public int insert(StudentClass student) {

        String query="INSERT INTO Student(std_id,std_name,std_email,std_dob,std_age)" +
                "VALUES(?,?,?,?,?)";
        int res=this.jdbctemplate.update(query,student.getId(),student.getName(),student.getEmail(),
                student.getDob(),student.getAge());
        return res;
    }

    @Override
    public List<StudentClass> selectStudent(Long id) {

        selectRes=new ArrayList<>();

        String query="SELECT * FROM Student WHERE std_id=?";
        RowMapper<StudentClass> rowMapper=new RowMapperClass();
        StudentClass studentClass=this.jdbctemplate.queryForObject(query,rowMapper,id);
        selectRes.add(studentClass);

        return selectRes;
    }

    public JdbcTemplate getJdbctemplate() {
        return jdbctemplate;
    }

    public void setJdbctemplate(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }
}
