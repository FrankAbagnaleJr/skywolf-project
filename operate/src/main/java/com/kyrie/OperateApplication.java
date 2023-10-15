package com.kyrie;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kyrie.mapper")
public class OperateApplication {
    public static void main(String[] args) {
        SpringApplication.run(OperateApplication.class, args);
    }
}
