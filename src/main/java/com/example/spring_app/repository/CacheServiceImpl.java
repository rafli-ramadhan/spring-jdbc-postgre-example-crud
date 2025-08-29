package com.example.spring_app.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void cacheSomething(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    public String getCachedValue(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
