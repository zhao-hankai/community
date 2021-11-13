package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
//线程池定时启用，需要加这个注解
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}
