package com.example.test.student;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoClass implements StudentDao{

    private JdbcTemplate jdbctemplate;

    @Override
    public int insert(StudentClass student) {

        String query="INSERT INTO studentdatabase.Student(std_id,std_name,std_email,std_dob,std_age)" +
                "VALUES(?,?,?,?,?)";
        int res=this.jdbctemplate.update(query,student.getId(),student.getName(),student.getEmail(),
                student.getDob(),student.getAge());
        return res;
    }

    public JdbcTemplate getJdbctemplate() {
        return jdbctemplate;
    }

    public void setJdbctemplate(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }
}
