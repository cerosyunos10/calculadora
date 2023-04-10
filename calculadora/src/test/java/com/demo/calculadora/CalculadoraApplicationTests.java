package com.demo.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.demo.calculadora.application.dto.CalculadoraDto;
import com.demo.calculadora.application.service.CalculadoraService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class CalculadoraApplicationTests {
	
	@Autowired
	CalculadoraService calculadoraservice;
	
	/*ENDPOINT SUMAR*/
	
	@Test
	void sumarCorrectamente() {
		CalculadoraDto calculadoraDto  = new CalculadoraDto("1", "2");
		String resultado = calculadoraservice.sumar(calculadoraDto);
		Assertions.assertEquals(resultado, "3");
	}
	
	@Test
	void sumarIsNotNull() {
		CalculadoraDto calculadoraDto  = null;
		String resultado = calculadoraservice.sumar(calculadoraDto);
		Assertions.assertNotNull(resultado);
	}
	
	
	@Test
	void sumarContieneLetra() {
		CalculadoraDto calculadoraDto  = new CalculadoraDto("1", "a");
		Assertions.assertThrows(NumberFormatException.class, 
				() -> {
					calculadoraservice.sumar(calculadoraDto);
			    });
	}
	
	@Test
	void sumarNoArrojaNingunaExcepcion() {
		CalculadoraDto calculadoraDto  = new CalculadoraDto("1", null);
		Assertions.assertDoesNotThrow(() -> calculadoraservice.sumar(calculadoraDto));
	}
	
	
	/*ENDPOINT RESTAR*/
	
	@Test
	void restarCorrectamente() {
		CalculadoraDto calculadoraDto  = new CalculadoraDto("7", "4");
		String resultado = calculadoraservice.restar(calculadoraDto);
		Assertions.assertEquals(resultado, "3");
	}
	
	@Test
	void restarIsNotNull() {
		CalculadoraDto calculadoraDto  = null;
		String resultado = calculadoraservice.restar(calculadoraDto);
		Assertions.assertNotNull(resultado);
	}
	
	
	@Test
	void restarContieneLetra() {
		CalculadoraDto calculadoraDto  = new CalculadoraDto("1", "a");
		Assertions.assertThrows(NumberFormatException.class, 
				() -> {
					calculadoraservice.restar(calculadoraDto);
			    });
	}
	
	@Test
	void restarNoArrojaNingunaExcepcion() {
		CalculadoraDto calculadoraDto  = new CalculadoraDto("1", null);
		Assertions.assertDoesNotThrow(() -> calculadoraservice.restar(calculadoraDto));
	}
	

}
