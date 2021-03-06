package com.gioov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018-02-22
 */
@SpringBootApplication
public class NimrodJarBootstrap {
    private static final Logger LOGGER = LoggerFactory.getLogger(NimrodJarBootstrap.class);
    public static void main(String[] args) {
        SpringApplication.run(NimrodJarBootstrap.class, args);
        LOGGER.info("==================={}===================", "Nimrod is started");
    }
}