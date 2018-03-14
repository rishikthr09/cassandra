package org.apache.cassandra.service;

import java.util.Objects;

import redis.clients.jedis.Jedis;

public class RedisService
{

    private static Jedis redisConnection;

    public static final RedisService instance = new RedisService();


    public Jedis getCacheConnection()
    {
        if (Objects.isNull(redisConnection))
        {
            //throw error
        }
        return redisConnection;
    }


    public void createCacheConnection(String host, int port)
    {
        if (Objects.isNull(redisConnection))
        {
            redisConnection = new Jedis(host, port);
        }
    }

}
