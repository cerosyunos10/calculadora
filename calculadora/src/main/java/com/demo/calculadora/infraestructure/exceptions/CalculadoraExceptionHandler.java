package com.demo.calculadora.infraestructure.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CalculadoraExceptionHandler {

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler({NumberFormatException.class})
	public String errorSumarNumerosCalculadora(Exception e) {
		StringBuilder stb = new StringBuilder();
		stb.append(e.getMessage()).append(" Causa: ").append(e.getCause());
		return String.valueOf(stb);
	}
	
	
}
