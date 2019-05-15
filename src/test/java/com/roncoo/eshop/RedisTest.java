package com.roncoo.eshop;

import com.roncoo.eshop.config.RedisConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
@Configuration
public class RedisTest {

    @Test
    public  void main1() {
        Jedis jedis = RedisConfig.jedisPool().getResource();
        jedis.set("k1","v1");
        System.out.println(jedis.get("k1"));


    }

}
