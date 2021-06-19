package com.example.test.student;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperClass implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {

        StudentClass studentClass=new StudentClass();
        studentClass.setId(resultSet.getLong("std_id"));
        studentClass.setName(resultSet.getString("std_name"));
        studentClass.setEmail(resultSet.getString("std_email"));
        studentClass.setDob(resultSet.getDate("std_dob").toLocalDate());
        studentClass.setAge(resultSet.getInt("std_age"));

        return studentClass;
    }
}
