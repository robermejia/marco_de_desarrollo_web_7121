package com.jhon0206.spring_shield.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("inicio");
        registry.addViewController("/privado").setViewName("privado");
        registry.addViewController("/publico").setViewName("publico");
        registry.addViewController("/ingresar").setViewName("iniciar-sesion");
        registry.addRedirectViewController("/inicio", "/");
    }
}
