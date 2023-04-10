package com.demo.calculadora.application.service;

import com.demo.calculadora.application.dto.CalculadoraDto;

public interface CalculadoraService {

	/**
	 * Realiza la suma de dos números
	 * 
	 * @param calculadoraDto
	 * @return String
	 */
	public String sumar(CalculadoraDto calculadoraDto);
	
	/**
	 * Realiza la resta de dos números
	 * 
	 * @param calculadoraDto
	 * @return String
	 */
	public String restar(CalculadoraDto calculadoraDto);
	
}
