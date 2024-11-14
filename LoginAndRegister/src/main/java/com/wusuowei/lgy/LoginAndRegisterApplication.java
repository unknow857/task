package com.wusuowei.lgy;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wusuowei.lgy.mapper")
@SpringBootApplication
public class LoginAndRegisterApplication {
    private static final Logger logger = LoggerFactory.getLogger(LoginAndRegisterApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(LoginAndRegisterApplication.class, args);
       
    }

}
