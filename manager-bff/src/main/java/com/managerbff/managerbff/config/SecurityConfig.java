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
    return http.authorizeExchange()
//        .pathMatchers("/").permitAll()
        .pathMatchers("**/*.js", "**/*.css").permitAll()
        .pathMatchers("/actuator/prometheus").permitAll()
        .anyExchange().hasAnyRole("ADMIN")
        .and()
        .oauth2Login()
        .and()
        .httpBasic().disable()
        .formLogin().disable()
        .csrf().disable().build();
  }
}

