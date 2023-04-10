package com.demo.calculadora.domain.service.impl;

import org.springframework.stereotype.Service;

import com.demo.calculadora.domain.CalculadoraDomainService;
import com.demo.calculadora.domain.model.Calculadora;

@Service
public class CalculadoraDomainServiceImpl implements CalculadoraDomainService{

	@Override
	public String sumar(Calculadora calculadora) {
		return String.valueOf(calculadora.getFirstNum().add(calculadora.getSecondNum()));
	}
	
	@Override
	public String restar(Calculadora calculadora) {
		return String.valueOf(calculadora.getFirstNum().subtract(calculadora.getSecondNum()));
	}

}
