- Estructura del proyecto:
   La aplicación es un microservicio Spring Boot 3.0 realizado con el lenguaje de programación Java.
   La estructura del proyecto es de arquitectura hexagonal (Domain-Driven Design(DDD)).
    - infraestructure: Config, exceptions, rest, etc.
    - application: dto, service, utils, etc.
    - domain: model, service, etc.
- Dependencias utilizadas:
   - OpenApi Swagger: Para crear la interfaz de OpenApi Swagger (V2 compatible con Spring Boot 3.0) (springdoc-openapi-starter-webmvc-ui).
   - lombok: Para generar automáticamente código repetitivo como Getters And Setters, constructores etc.
   - Recompilar automáticamente al modificar código: Para que Spring Boot detecte las modificaciones de código automáticamente y recompile la aplicación (spring-boot-devtools).
   - JUnit5 y la extensión de Mockito: Para realizar las pruebas de test unitarias (junit-jupiter-engine, mockito-core, mockito-junit-jupiter).
   - Tracer: Para informar en la consola para informar por consola los errores generados.
- Funcionalidades implementadas y alcance del servicio:
	El microservicio contiene dos funciones:
	- Sumar: Se inserta dos valores como parámetros de entrada (primer número y segundo número) y realiza la suma.
	- Restar: Se inserta dos valores como parámetros de entrada (primer número y segundo número) y realiza la resta.
- Procedimientos de compilación y funcionamiento:
	Para compilar el proyecto correctamente, es necesario descargarse la librería tracer e importarla como fichero Jar Externo desde el ClassPath del proyecto y modificar el valor "SET_LOCAL_PATH" de la dependencia en el fichero POM.xml con la ruta absoluta. 
- Ejemplos de llamadas de la API:
	- Sumar: http://localhost:8080/operacion/restar?firstNum=7&secondNum=4
	- Restar: http://localhost:8080/operacion/sumar?firstNum=1&secondNum=2
	