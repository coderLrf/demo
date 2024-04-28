package com.example.module.test.controller;

import com.example.api.test.TestApi;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrf
 * @create 2024/3/2
 */

@AllArgsConstructor
@RestController
public class TestController implements TestApi {
    
    private RedisTemplate redisTemplate;
    
    @Override
    public Object insert(Long id) {
        String key = "name";
        String value = "我是迪迦奥特曼";
        redisTemplate.opsForValue().set(key, value);
        return "ok";
    }
}
