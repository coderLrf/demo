package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 异步任务config
 *
 * @author lrf
 * @create 2024/3/8
 */

@EnableAsync
@Configuration
public class AsyncTaskConfig {
    
    @Bean
    public ThreadPoolTaskExecutor asyncTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 1.核心线程数
        executor.setCorePoolSize(4);
        // 2.最大线程数，只有在缓冲队列满了之后才会申请超过核心线程数的线程
        executor.setMaxPoolSize(10);
        // 3.队列中最大的数目
        executor.setQueueCapacity(200);
        // 4.线程名称前缀
        executor.setThreadNamePrefix("LocustTask-");
        // 5.当pool已经达到max size的时候，如何处理新任务
        // CallerRunsPolicy: 会在execute 方法的调用线程中运行被拒绝的任务,如果执行程序已关闭，则会丢弃该任务
        // AbortPolicy: 抛出java.util.concurrent.RejectedExecutionException异常
        // DiscardOldestPolicy: 抛弃旧的任务
        // DiscardPolicy: 抛弃当前的任务
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 6.线程空闲后的最大存活时间（默认值60），当超过了核心线程出之外的线程在空闲时间到达之后会被销毁
        executor.setKeepAliveSeconds(60);
        // 7.线程空闲时间，当线程空闲时间达到KeepAliveSeconds（秒）时，线程会退出，直到线程数量等于corePoolSize，如果allowCoreThreadTimeout=true，则会直到线程数量等于0
        executor.setAllowCoreThreadTimeOut(true);
        executor.initialize();
        return executor;
    }

}
