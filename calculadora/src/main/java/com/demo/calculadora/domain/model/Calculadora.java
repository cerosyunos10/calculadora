package com.demo.calculadora.domain.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Calculadora {

	/**
	 * firstNum
	 */
	private BigDecimal firstNum;
	
	/**
	 * secondNum
	 */
	private BigDecimal secondNum;
	
}
