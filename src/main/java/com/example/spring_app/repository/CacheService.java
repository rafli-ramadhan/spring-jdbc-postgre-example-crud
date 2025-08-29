package com.example.spring_app.repository;

public interface CacheService {

    void cacheSomething(String key, String value);

    String getCachedValue(String key);

}
