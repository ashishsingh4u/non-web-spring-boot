package com.techienotes.nonweb.springboot;

import com.techienotes.nonweb.springboot.runners.TestAppRunner;
import com.techienotes.nonweb.springboot.runners.TestCommandRunner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {ServletWebServerFactoryAutoConfiguration.class, WebMvcAutoConfiguration.class})
@Slf4j
public class NonWebSpringBootApplication {

	public static void main(String[] args) {
		log.info("Calling main method");
		SpringApplication.run(NonWebSpringBootApplication.class, args);
	}

	@Bean
	public ApplicationRunner getAppRunner() {
		return new TestAppRunner();
	}

	@Bean
	public CommandLineRunner getCommandRunner() {
		return new TestCommandRunner();
	}

}
