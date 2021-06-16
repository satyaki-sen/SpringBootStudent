package com.example.test.student;

import java.time.LocalDate;

public class StudentClass {

    private Long id;
    private String name;
    private LocalDate dob;
    private Integer age;
    private String email;

    public StudentClass() {
    }

    public StudentClass(Long id,String name, String email,LocalDate dob ,Integer age) {
        this.id=id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}