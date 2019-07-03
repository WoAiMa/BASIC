package com.maq.basic.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {

    public  static  final Logger logger = LoggerFactory.getLogger(LogDemo.class);

    public static void main(String[] args) {
        logger.info("hello world !");
    }
}
