package com.demo.calculadora.infraestructure.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.demo.calculadora.application.dto.CalculadoraDto;
import com.demo.calculadora.application.service.CalculadoraService;
import com.demo.calculadora.application.utils.CalculadoraConstants;
import com.demo.calculadora.infraestructure.exceptions.CalculadoraNumberFormatException;
import io.corp.calculator.TracerImpl;
import io.swagger.v3.core.util.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.apache.commons.lang3.StringUtils;


@RestController
@Tag(name = "CalculadoraApi")
@RequestMapping(value = "/operacion")
@RequiredArgsConstructor(onConstructor = @__({ @Autowired }))
public class CalculadoraApi {
	
	private final CalculadoraService service;
	
	@Qualifier("tracer")
	private final TracerImpl tracer;

	@Operation(summary = "Operación Sumar", description = "Realiza la suma de los dos números indicados en los parámetros de entrada.", tags = {"CalculadoraApi"})
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "200", description = "Se ha realizado la suma correctamente."),
	  @ApiResponse(responseCode = "400", description = "Ha ocurrido un error al realizar la suma.")})
	@GetMapping("/sumar")
    public ResponseEntity<String> sumar(
    		@Parameter(description = CalculadoraConstants.FIRST_NUM_DESC) @RequestParam(value = CalculadoraConstants.FIRST_NUM_NOM_VAR, defaultValue = CalculadoraConstants.ZERO_STR_VALUE) String firstNum, 
    		@Parameter(description = CalculadoraConstants.SECOND_NUM_DESC) @RequestParam(value = CalculadoraConstants.SECOND_NUM_NOM_VAR, defaultValue = CalculadoraConstants.ZERO_STR_VALUE) String secondNum) throws CalculadoraNumberFormatException {
		
		String result = null;
		
		try {
			
		CalculadoraDto calculadoraDto = new CalculadoraDto(firstNum, secondNum);
		result = "El resultado de la suma es: " + service.sumar(calculadoraDto);
		
		}catch(NumberFormatException e) {
			tracer.trace(e);
			throw new CalculadoraNumberFormatException("Ha ocurrido un error al sumar los números. Valores recibidos: " 
					+ firstNum + Constants.COMMA +  StringUtils.SPACE + secondNum);
		}
		
		return new ResponseEntity<>(result, HttpStatus.OK);
    }
	
	
	@Operation(summary = "Operación Restar", description = "Realiza la resta de los dos números indicados en los parámetros de entrada.", tags = {"CalculadoraApi"})
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "200", description = "Se ha realizado la resta correctamente."),
	  @ApiResponse(responseCode = "400", description = "Ha ocurrido un error al realizar la resta.")})
	@GetMapping("/restar")
    public ResponseEntity<String> restar(
    		@Parameter(description = CalculadoraConstants.FIRST_NUM_DESC) @RequestParam(value = CalculadoraConstants.FIRST_NUM_NOM_VAR, defaultValue = CalculadoraConstants.ZERO_STR_VALUE) String firstNum, 
    		@Parameter(description = CalculadoraConstants.SECOND_NUM_DESC) @RequestParam(value = CalculadoraConstants.SECOND_NUM_NOM_VAR, defaultValue = CalculadoraConstants.ZERO_STR_VALUE) String secondNum) throws CalculadoraNumberFormatException {
		
		String result = null;
		
		try {
			
		CalculadoraDto calculadoraDto = new CalculadoraDto(firstNum, secondNum);
		result = "El resultado de la resta es: " + service.restar(calculadoraDto);
		
		}catch(NumberFormatException e) {
			tracer.trace(e);
			throw new CalculadoraNumberFormatException("Ha ocurrido un error al restar los números. Valores recibidos: " 
					+ firstNum + Constants.COMMA +  StringUtils.SPACE + secondNum);
		}
		
		return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
