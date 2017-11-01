package com.springbootdev.samples.springbootcommandlineapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCommandlineApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootCommandlineApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCommandlineApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
       LOGGER.info(" ***** Greetings from www.SpringBootDev.com  ***** ");
    }
}
