package com.atmae.myrabc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "com.atmae.myrabc.mapper")
public class MyRabcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyRabcApplication.class, args);
    }

}
