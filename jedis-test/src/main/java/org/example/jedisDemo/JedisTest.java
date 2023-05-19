package org.example.jedisDemo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

import java.util.Set;

public class JedisTest {

    public static void main(String[] args) {
        JedisShardInfo info = new JedisShardInfo("redis://101.43.161.206:6379");
        info.setPassword("123456");
        Jedis jedis = new Jedis(info);
        String ping = jedis.ping();
        System.out.println(ping);

        System.out.println(jedis.flushDB());
        System.out.println(jedis.exists("username"));
        System.out.println(jedis.set("username", "zzh"));
        System.out.println(jedis.set("password", "123456"));
        Set<String> keys = jedis.keys("*");
        System.out.println(keys);

        System.out.println(jedis.del("password"));
        System.out.println(jedis.exists("password"));
        System.out.println(jedis.type("username"));
        System.out.println(jedis.randomKey());
        System.out.println(jedis.rename("username", "name"));
        System.out.println(jedis.get("name"));
        System.out.println(jedis.select(0));
        System.out.println(jedis.flushDB());
        System.out.println(jedis.dbSize());
        System.out.println(jedis.flushAll());

    }

}
