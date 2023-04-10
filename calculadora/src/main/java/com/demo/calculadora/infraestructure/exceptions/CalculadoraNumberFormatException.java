package com.demo.calculadora.infraestructure.exceptions;

//import org.springframework.beans.factory.annotation.Autowired;
//import io.corp.calculator.TracerAPI;

public class CalculadoraNumberFormatException extends NumberFormatException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2172399967390652385L;
	
	public CalculadoraNumberFormatException(String message) {
        super(message);
    }

}
