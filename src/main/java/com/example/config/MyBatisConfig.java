package com.example.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * myBatis配置
 *
 * @author lrf
 * @created 2024/4/26
 */
@Configuration
@MapperScan("com.example.**.dao")
public class MyBatisConfig {
    
}
