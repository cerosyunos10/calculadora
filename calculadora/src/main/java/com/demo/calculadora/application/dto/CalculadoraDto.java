package com.demo.calculadora.application.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author unosyceros10
 *
 */
@RequiredArgsConstructor
@Data
public class CalculadoraDto implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2375662238457434619L;
	
	/**
	 * firstNum
	 */
	private final String firstNum;
	
	/**
	 * secondNum
	 */
	private final String secondNum;
	
	

}
