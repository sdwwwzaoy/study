package org.example.jedisDemo;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.Transaction;

public class TxTest {

    public static void main(String[] args) {
        JedisShardInfo info = new JedisShardInfo("redis://101.43.161.206:6379");
        info.setPassword("123456");
        Jedis jedis = new Jedis(info);
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.flushDB();

        JSONObject obj = new JSONObject();
        obj.put("hello", "world");
        obj.put("name", "zzh");
        String s = JSONObject.toJSONString(obj);
        Transaction tx = jedis.multi();
        try {
            tx.set("user1", s);
            tx.set("user2", s);
            tx.exec();
        } catch (Exception e) {
            tx.discard();
            e.printStackTrace();
        } finally {
            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            jedis.close();
        }


    }

}
