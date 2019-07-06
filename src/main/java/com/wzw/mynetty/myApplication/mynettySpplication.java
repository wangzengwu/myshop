package com.wzw.mynetty.myApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: Joker_wang
 * @Date: 2019/6/20 23:57
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("com.wzw.mynetty.controller")
@ComponentScan("com.wzw.mynetty.service.impl")
@ComponentScan("com.wzw.mynetty.config")
@MapperScan(basePackages = "com.wzw.mynetty.dao.mapping")
@ImportResource("classpath:mybatis-tx.xml")
@SpringBootApplication
public class mynettySpplication  {
    public static void main(String[] args)  {
        SpringApplication.run(mynettySpplication.class,args);
           }
}
