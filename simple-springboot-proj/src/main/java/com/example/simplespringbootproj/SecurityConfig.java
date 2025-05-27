package com.example.simplespringbootproj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.Customizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/hello").permitAll()      // hello는 인증 없이 허용
                        .anyRequest().authenticated()                 // 나머지는 인증 필요
                )
                .csrf(csrf -> csrf.disable());  // CSRF 비활성화 (테스트용)

        return http.build();
    }
}