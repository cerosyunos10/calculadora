package com.demo.calculadora.application.utils;


import com.demo.calculadora.application.dto.CalculadoraDto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 
 * @author unosyceros10
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CalculadoraValidation {
	
	public static boolean isNull(CalculadoraDto calculadoraDto) {
		return (calculadoraDto == null);
	}

}
