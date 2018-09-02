package com.passioncell.kakaoixshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
@MapperScan(value={"com.passioncell.kakaoixshop.mapper"})
public class KakaoIXShopApplication extends SpringBootServletInitializer {

    private static Class applicationClass = KakaoIXShopApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(KakaoIXShopApplication.class, args);
    }


}
