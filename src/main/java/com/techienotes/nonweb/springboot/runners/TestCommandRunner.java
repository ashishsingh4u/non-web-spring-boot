package com.techienotes.nonweb.springboot.runners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

@Slf4j
@Order(1)
public class TestCommandRunner implements CommandLineRunner {
    
    @Override
    public void run(String... args) {
        log.info("CommandLineRunner executed");

        log.info("ApplicationRunner Order {}", 1);
        log.info("Thread Name: {}", Thread.currentThread().getName());
        log.info("Arguments {}", String.join(", ", args));
        log.info("{}", Thread.currentThread().getStackTrace()[1]);
    }

}
