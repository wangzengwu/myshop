package com.wzw.springboot.config;

import com.wzw.springboot.domain.TestEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Joker_wang
 * @Date: 2019/3/11 11:08
 * @Version 1.0.0
 */
@Configuration
public class TestConfig {

    @Bean
    public TestEntity getTestEntity(){
        TestEntity testEntity = new TestEntity();
        return testEntity;
    }
}
