package com.ren;

import com.ren.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by dongao on 2018/11/22.
 * @EnableZuulProxy 开启Zuul 的API网关服务功能
 */
@EnableZuulProxy
@SpringCloudApplication
public class GateWayApp {

    //追加bean的是实现
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }


    public static void main(String[] args) {
        SpringApplication.run(GateWayApp.class,args);
    }
}
