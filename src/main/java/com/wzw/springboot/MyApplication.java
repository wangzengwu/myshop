package com.wzw.springboot;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: Joker_wang
 * @Date: 2019/3/11 10:28
 * @Version 1.0.0
 */
@Configuration
@ComponentScan({"com.wzw.springboot.controller","com.wzw.springboot.config"})
@ComponentScan("com.wzw.springboot.service.impl")
@MapperScan(basePackages = "com.wzw.springboot.dao")
@ImportResource("classpath:mybatis-tx.xml")
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
}
