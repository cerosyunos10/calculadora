package com.demo.calculadora.application.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.calculadora.application.dto.CalculadoraDto;
import com.demo.calculadora.application.service.CalculadoraService;
import com.demo.calculadora.domain.CalculadoraDomainService;
import com.demo.calculadora.domain.model.Calculadora;

@Service
public class CalculadoraServiceImpl implements CalculadoraService{
	
	@Autowired
	CalculadoraDomainService calculadoraDomainService;

	/**
	 * Realiza la suma de dos números
	 * 
	 * @param calculadoraDto
	 * @return
	 */
	@Override
	public String sumar(CalculadoraDto calculadoraDto) {
		String result = null;
		Calculadora calculadora = new Calculadora();
		this.setCalculadoraData(calculadoraDto, calculadora);
		result = calculadoraDomainService.sumar(calculadora);
		return result;
	}
	
	
	/**
	 * Realiza la resta de dos números
	 * 
	 * @param calculadoraDto
	 * @return
	 */
	@Override
	public String restar(CalculadoraDto calculadoraDto) {
		String result = null;
		Calculadora calculadora = new Calculadora();
		this.setCalculadoraData(calculadoraDto, calculadora);
		result = calculadoraDomainService.restar(calculadora);
		return result;
	}
	
	/**
	 * Comprueba que el dto de entrada no sea nulo y asigna los datos al modelo.
	 * 
	 * @param calculadoraDto, calculadora
	 * @return
	 */
	private void setCalculadoraData(CalculadoraDto calculadoraDto, Calculadora calculadora) {
		
		if(calculadoraDto != null) {
			String firstNum = (calculadoraDto.getFirstNum() == null) ? "0" : calculadoraDto.getFirstNum();
			String secondNum = (calculadoraDto.getSecondNum() == null) ? "0" : calculadoraDto.getSecondNum();
			
			calculadora.setFirstNum(new BigDecimal(firstNum));
			calculadora.setSecondNum(new BigDecimal(secondNum));
		}else {
			calculadora.setFirstNum(new BigDecimal(0));
			calculadora.setSecondNum(new BigDecimal(0));
		}
	}
}
