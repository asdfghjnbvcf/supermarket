package com.etc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(basePackages ={"com.etc.dao"})
@SpringBootApplication
@EnableCaching
public class SupermarketApplication {

    public static void main ( String[] args ) {
        SpringApplication.run(SupermarketApplication.class, args);
    }

}
