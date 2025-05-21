package com.robin.transaction.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Async executor thread pool properties
 */
@ConfigurationProperties(prefix = "async.executor")
@Data
public class AsyncExecutorProperties {

    private int corePoolSize = 10;
    private int maxPoolSize = 20;
    private int keepAliveSeconds = 60;
    private int queueCapacity = 500;
}