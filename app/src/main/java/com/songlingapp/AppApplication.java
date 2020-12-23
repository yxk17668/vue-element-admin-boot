package com.songlingapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@Slf4j
@EnableCaching
@SpringBootApplication
public class AppApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(AppApplication.class, args);
        log.info("智慧健康启动");
    }

}