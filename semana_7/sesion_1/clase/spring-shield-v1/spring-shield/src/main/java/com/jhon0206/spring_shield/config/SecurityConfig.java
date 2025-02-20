package com.jhon0206.spring_shield.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
//import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {
        return http.authorizeHttpRequests(
                auth -> auth.requestMatchers("/", "/css/**", "/img/**", "/inicio", "/publico").permitAll()
                        .anyRequest().authenticated())
                //.formLogin(Customizer.withDefaults())
                .formLogin(
                    login -> login.loginPage("/ingresar")
                    .loginProcessingUrl("/login")
                    //.failureUrl("/ingresa")
                    .defaultSuccessUrl("/privado").permitAll()
                )
                .logout(logout -> logout.logoutSuccessUrl("/inicio").permitAll())
                .build();
    }
}
