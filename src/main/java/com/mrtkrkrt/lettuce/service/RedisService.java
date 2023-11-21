package com.mrtkrkrt.lettuce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RedisService<T> {
    private final RedisTemplate<String, T> redisTemplate;

    public T getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
