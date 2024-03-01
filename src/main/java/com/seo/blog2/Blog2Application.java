package com.seo.blog2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// (exclude = {SecurityAutoConfiguration.class})  추가해야 실행시 톰캣 로그인 화면 안나옴.
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Blog2Application {

    public static void main(String[] args) {
        SpringApplication.run(Blog2Application.class, args);
    }

}
