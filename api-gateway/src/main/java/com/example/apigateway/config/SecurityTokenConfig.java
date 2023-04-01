package com.example.apigateway.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityTokenConfig {
    @Autowired
    private JwtTokenAuthenticationFilter filter;
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes().route("auth", r -> r.path("/auth/**").filters(f -> f.filter(filter)).uri("lb://auth-service"))
                .route("product", r -> r.path("/product/**").filters(f -> f.filter(filter)).uri("lb://product-catalog"))
                .route("cart", r -> r.path("/cart/**").filters(f -> f.filter(filter)).uri("lb://cart-service")).build();
    }
}
