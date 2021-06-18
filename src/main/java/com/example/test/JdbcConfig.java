package com.example.test;

import com.example.test.student.StudentDao;
import com.example.test.student.StudentDaoClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean(name={"ds"})
    public DataSource getDatasource(){

        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studentdatabase");
        ds.setUsername("root");
        ds.setPassword("abcd@1234");
        return ds;
    }

    @Bean(name={"jdbcTemplate"})
    public JdbcTemplate getTemplate(){

        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDatasource());
        return jdbcTemplate;
    }

    @Bean(name={"studentDao"})
    public StudentDao getStudentDao(){

        StudentDaoClass studentDao=new StudentDaoClass();
        studentDao.setJdbctemplate(getTemplate());
        return studentDao;
    }

}
