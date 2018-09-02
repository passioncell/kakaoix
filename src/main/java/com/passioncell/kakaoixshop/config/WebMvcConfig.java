package com.passioncell.kakaoixshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


/*
    인증 인터셉터를 등록하는 설정클래스.
    (member/sign*, /exceptionHandler 경로는 제외한다.)
 */

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CertificationInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/member/sign*")
                .excludePathPatterns("/exceptionHandler/**")
                .excludePathPatterns("/static/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
