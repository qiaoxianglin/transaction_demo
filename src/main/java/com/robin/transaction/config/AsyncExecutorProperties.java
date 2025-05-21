package com.robin.transaction.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Async executor thread pool properties
 */
@ConfigurationProperties(prefix = "async.executor")
public class AsyncExecutorProperties {

    private int corePoolSize = 10;
    private int maxPoolSize = 20;
    private int keepAliveSeconds = 60;
    private int queueCapacity = 500;

    // Getters and Setters
    public int getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public int getKeepAliveSeconds() {
        return keepAliveSeconds;
    }

    public void setKeepAliveSeconds(int keepAliveSeconds) {
        this.keepAliveSeconds = keepAliveSeconds;
    }

    public int getQueueCapacity() {
        return queueCapacity;
    }

    public void setQueueCapacity(int queueCapacity) {
        this.queueCapacity = queueCapacity;
    }
}