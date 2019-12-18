package com.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *   启动类
 * @author Wangxw
 * @date 2019-12-18 18:55
 */
@SpringBootApplication
@MapperScan("com.java.mapper")
public class Phonebook2Application {

    public static void main(String[] args) {
        SpringApplication.run(Phonebook2Application.class, args);
    }

}
