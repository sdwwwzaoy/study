package org.example.jedisDemo;

import com.alibaba.fastjson.JSON;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

import java.util.concurrent.TimeUnit;

public class JedisStringTest {

    public static void main(String[] args) throws InterruptedException {
        JedisShardInfo info = new JedisShardInfo("redis://101.43.161.206:6379");
        info.setPassword("123456");
        Jedis jedis = new Jedis(info);
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.flushDB();

        System.out.println(jedis.set("key1", "value1"));
        System.out.println(jedis.set("key2", "value2"));
        System.out.println(jedis.set("key3", "value3"));
        System.out.println(jedis.del("key2"));
        System.out.println(jedis.get("key2"));
        System.out.println(jedis.set("key1", "value1Changed"));
        System.out.println(jedis.get("key1"));
        System.out.println(jedis.append("key3", "End"));
        System.out.println(jedis.get("key3"));

        System.out.println(jedis.mset("key01", "value01", "key02", "value02", "key03", "value03"));
        System.out.println(JSON.toJSONString(jedis.mget("key01", "key02", "key03", "key04")));
        System.out.println(JSON.toJSONString(jedis.del("key01", "key02")));
        System.out.println(JSON.toJSONString(jedis.mget("key01", "key02", "key03")));
        System.out.println("======================");

        jedis.flushDB();
        System.out.println(jedis.setnx("key1", "value1"));
        System.out.println(jedis.setnx("key2", "value2"));
        System.out.println(jedis.setnx("key2", "value2-new"));
        System.out.println(jedis.get("key1"));
        System.out.println(jedis.get("key2"));

        System.out.println(jedis.setex("key3", 2, "value3"));
        System.out.println(jedis.get("key3"));
        TimeUnit.SECONDS.sleep(3);
        System.out.println(jedis.get("key3"));
        System.out.println(jedis.getSet("key2", "key2GetSet"));
        System.out.println(jedis.get("key2"));

        System.out.println(jedis.getrange("key2", 2, 4));


    }

}
