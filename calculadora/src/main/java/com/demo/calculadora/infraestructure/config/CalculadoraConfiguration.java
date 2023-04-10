package com.demo.calculadora.infraestructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.corp.calculator.TracerImpl;


@Configuration
public class CalculadoraConfiguration {

	@Bean
	public TracerImpl tracer() {
		return new TracerImpl();
	}
	
}
