package com.apigtw.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
			.route(r -> r.path("/movie/**")
				.filters(f -> f.hystrix(c -> c.setName("movie-service").setFallbackUri("forward:/fallback/movie")))
				.uri("http://localhost:8087"))
			.route(r -> r.path("/user/**")
				.filters(f -> f.hystrix(c -> c.setName("user-service").setFallbackUri("forward:/fallback/user")))
				.uri("http://localhost:8086"))
			.build();
	}
}
