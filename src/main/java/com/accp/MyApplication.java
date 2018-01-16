package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/13 13:36
 * @Version: 1.0
 */
//@ComponentScan(basePackages = {"com.accp.dao","com.accp.service","com.accp.web.controller"})
//@EnableAutoConfiguratio
@MapperScan("com.accp.dao")
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);

    }
}
