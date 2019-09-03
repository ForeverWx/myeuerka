package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//本地新开发功能1
//远程修改了代码
@SpringBootApplication
@EnableZuulProxy
public class MyShopGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopGatewayApplication.class, args);
    }

}
