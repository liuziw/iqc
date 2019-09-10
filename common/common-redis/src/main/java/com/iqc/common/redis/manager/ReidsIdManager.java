package com.iqc.common.redis.manager;

import com.iqc.common.core.manager.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author liuziw
 */
@Component
public class ReidsIdManager implements IdManager {

    @Autowired
    RedisTemplate redisTemplate;

    private static final String GLOBAL_KEY = "RedisIdManager:GLOBAL_KEY";

    @Override
    public Long createId() {
        return redisTemplate.opsForValue().increment(GLOBAL_KEY,1L);
    }

    @Override
    public Long createId(String key) {
        return redisTemplate.opsForValue().increment(key,1L);
    }
}
