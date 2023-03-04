package com.managerbff.managerbff.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

  @Bean
  public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http)
      throws Exception {
    http
        .authorizeExchange()
        .pathMatchers("**/*.js", "**/*.css").permitAll()
        .pathMatchers("/management").permitAll()
        .anyExchange().authenticated()
        .and()
        .oauth2Login()
        .and()
        .csrf().disable()
        .formLogin().disable()
        .cors().disable();
    return http.build();
  }
}

