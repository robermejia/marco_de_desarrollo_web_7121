package com.robermejia.utp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.robermejia.utp.services.UsuarioService;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final UsuarioService service;

    private UserDetailsService getDetailsService() {
        return service;
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(getDetailsService());
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {
        return http.authorizeHttpRequests(
                auth -> auth.requestMatchers("/", "/css/**","/js/**", "/img/**", "/inicio", "/acerca","/productos","/servicios","/contacto").permitAll()
                        .requestMatchers("/admin").hasAuthority("admin")
                        .anyRequest().authenticated())
                // .formLogin(Customizer.withDefaults())
                .exceptionHandling(
                    ex -> ex.accessDeniedPage("/error-403")
                )
                .formLogin(
                        login -> login.loginPage("/ingresar")
                                .loginProcessingUrl("/login")
                                .defaultSuccessUrl("/administracion").permitAll())
                .logout(logout -> logout.logoutSuccessUrl("/inicio").permitAll())
                .build();
    }
}
