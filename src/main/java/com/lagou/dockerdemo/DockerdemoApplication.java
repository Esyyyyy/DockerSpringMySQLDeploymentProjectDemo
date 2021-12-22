package com.lagou.dockerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lagou.dockerdemo.mapper")
public class DockerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerdemoApplication.class, args);
    }

}
