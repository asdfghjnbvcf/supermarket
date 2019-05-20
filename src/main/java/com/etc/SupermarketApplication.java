package com.etc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages ={"com.etc.*.dao"})
@SpringBootApplication
public class SupermarketApplication {

    public static void main ( String[] args ) {
        SpringApplication.run(SupermarketApplication.class, args);
    }

}
