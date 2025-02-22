package com.robermejia.utp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
                auth -> auth.requestMatchers("/", "/css/**","/css/**","/js/**", "/img/**", "/inicio", "/acerca","/contacto","/productos","/servicios").permitAll()
                        .anyRequest().authenticated())
                //.formLogin(Customizer.withDefaults())
                .formLogin(
                    login -> login.loginPage("/ingresar")
                    .loginProcessingUrl("/login")
                    //.failureUrl("/ingresa")
                    .defaultSuccessUrl("/administracion").permitAll()
                )
                .logout(logout -> logout.logoutSuccessUrl("/inicio").permitAll())
                .build();
    }
}