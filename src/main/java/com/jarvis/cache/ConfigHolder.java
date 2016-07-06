package com.jarvis.cache;

public class ConfigHolder {

    protected static final ThreadLocal<CacheConfig> CONFIG = new ThreadLocal<CacheConfig>();

    public static CacheConfig getLocalConfig() {
        return CONFIG.get();
    }

    public static void setLocalConfig(CacheConfig config) {
        CONFIG.set(config);
    }
    /**
     * 移除本地变量
     */
    public static void clearLocalConfig() {
        CONFIG.remove();
    }

}
