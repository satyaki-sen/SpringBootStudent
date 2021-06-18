package com.example.test.student;

import org.springframework.jdbc.core.JdbcTemplate;

public interface StudentDao {

    public int insert(StudentClass student);

}
