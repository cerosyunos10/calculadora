package com.demo.calculadora.infraestructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.corp.calculator.TracerImpl;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@Configuration
public class CalculadoraConfiguration {
	
	@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Calculadora API")
                        .version("1.0.0")
                        .description("Ejemplo de calculadora Spring Boot 3 con Swagger")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

	@Bean
	public TracerImpl tracer() {
		return new TracerImpl();
	}
	
}
