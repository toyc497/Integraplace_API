package com.api.integraplace.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**").allowedOrigins("*").allowedHeaders("*").allowedMethods("GET","POST","PUT","DELETE","HEAD","OPTIONS","TRACE","CONNECT").allowCredentials(false);

    }

}
