package com.robin.transaction.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.support.TaskExecutorAdapter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Configuration class for thread management.
 * Configures the thread pool executor for async operations.
 */
@Configuration
public class ThreadConfig {
    @Autowired
    private AsyncExecutorProperties asyncExecutorProperties;

    /**
     * Creates a thread pool task executor for async operations.
     * @return Configured Executor instance
     */
    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(asyncExecutorProperties.getCorePoolSize());
        executor.setMaxPoolSize(asyncExecutorProperties.getMaxPoolSize());
        executor.setKeepAliveSeconds(asyncExecutorProperties.getKeepAliveSeconds());
        executor.setQueueCapacity(asyncExecutorProperties.getQueueCapacity());
        executor.setThreadNamePrefix("async-executor-");
        executor.initialize();
        return executor;
    }
} 