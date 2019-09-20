package com.teachers;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.teachers.Dao")
public class TeachersApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachersApplication.class, args);
    }

}
