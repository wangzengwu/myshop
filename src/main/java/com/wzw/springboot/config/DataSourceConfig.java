package com.wzw.springboot.config;

/**
 * @Author: Joker_wang
 * @Date: 2019/3/11 19:28
 * @Version 1.0.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 *  mybatis事务相关配置
 *  @author Suoron
 */

@Configuration
public class DataSourceConfig {

    @Autowired
    DataSource dataSource;

    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}