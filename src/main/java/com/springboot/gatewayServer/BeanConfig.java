package com.springboot.gatewayServer;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/api/currentAccount/**")
						.uri("lb://SERVICE-ACCOUNT-CURRENT/")
						.id("service-currentAccount"))
		
				.route(r -> r.path("/api/fixedTermAccount/**")
						.uri("lb://SERVICE-ACCOUNT-FIXEDTERM/")
						.id("servicio-fixedTermAccount"))
				
				.route(r -> r.path("/api/savingsAccount/**")
						.uri("lb://SERVICE-ACCOUNT-SAVINGS/")
						.id("servicio-savingsAccount"))
				
				.route(r -> r.path("/api/cashAdvance/**")
						.uri("lb://SERVICE-CASHADVANCE/")
						.id("servicio-cashAdvance"))
				
				.route(r -> r.path("/api/enterprise/**")
						.uri("lb://SERVICE-ENTERPRISE/")
						.id("servicio-client-enterprise"))
				
				.route(r -> r.path("/api/personal/**")
						.uri("lb://SERVICE-PERSONAL/")
						.id("servicio-client-personal"))
				
				.route(r -> r.path("/api/creditCard/**")
						.uri("lb://SERVICE-CREDICARD/")
						.id("servicio-creditoCard"))
				
				.route(r -> r.path("/api/enterpriseCredit/**")
						.uri("lb://SERVICE-ENTERPRISECREDIT/")
						.id("servicio-enterpriseCredit"))
				
				.route(r -> r.path("/api/personalCredit/**")
						.uri("lb://SERVICE-PERSONALCREDIT/")
						.id("servicio-personalCredit"))
				
				.route(r -> r.path("/api/manageOperation/**")
						.uri("lb://SERVICE-MANAGEOPERATION/")
						.id("servicio-manageOperation"))
				.build();
	}
}
