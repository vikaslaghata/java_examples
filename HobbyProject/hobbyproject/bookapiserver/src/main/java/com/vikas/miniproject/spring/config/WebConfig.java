package com.vikas.miniproject.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan(basePackages = "com.vikas.miniproject.spring.controller" ) //TODO: check what if we change basePackages to value
public class WebConfig extends WebMvcConfigurationSupport {

}
