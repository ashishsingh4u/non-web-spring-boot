package com.techienotes.nonweb.springboot.runners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;

@Slf4j
public class TestAppRunner implements ApplicationRunner, Ordered {

    @Override
    public void run(ApplicationArguments args) {
        log.info("TestAppRunner started with {}", args);
//        args.containsOption("data");
        log.info("ApplicationRunner Order {}", getOrder());
        log.info("Thread Name: {}", Thread.currentThread().getName());
        log.info("Arguments {}", String.join(", ", args.getSourceArgs()));
        log.info("{}", Thread.currentThread().getStackTrace()[1]);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
