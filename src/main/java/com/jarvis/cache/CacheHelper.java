package com.jarvis.cache;

/**
 * Created by will on 16/7/6.
 */
public class CacheHelper {

    public static CacheConfig config(boolean cacheAble) {
        CacheConfig config = new CacheConfig();
        config.setCacheAble(cacheAble);
        ConfigHolder.setLocalConfig(config);
        return config;
    }
}
