package com.passioncell.kakaoixshop.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

/*
    view 단의 jsp 페이지에 공통 레이아웃을 적용하기 위한 tiles 설정
 */
@Configuration
public class TilesConfig {

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();

        String[] defs = { "WEB-INF/tiles.xml" };

        tilesConfigurer.setDefinitions(defs);

        return tilesConfigurer;
    }

    @Bean
    public UrlBasedViewResolver tilesViewResolver() {
        UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();

        tilesViewResolver.setViewClass(TilesView.class);

        return tilesViewResolver;
    }
}