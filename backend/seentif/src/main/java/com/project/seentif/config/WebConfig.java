package com.project.seentif.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//WebMvcConfigurer = MVC 관련 설정 확장(CORS, 리소스 핸들러, 인터셉터)
public class WebConfig implements WebMvcConfigurer {
    //CorsRegistry = 어떤 경로에 대해 CORS 정책 적용할지 지정
    //CORS 설정 정의
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}

