package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private Calculadora basicCalc=new Calculadora();
	
	
	  @BeforeAll
	  static void setupAll() {
		  System.out.println("BeforeAll");
	  }
	  
	  @BeforeEach 
	  void setUp() {
		  System.out.println("BeforeEach");
	  }
	  
	  @AfterEach
	  void tearDown() {
		  System.out.println("AfterEach");
	  }
	  
	  @AfterAll
	  static void tearDownAll(){
		  System.out.println("AfterAll");
	  }
	  
	  @Test
	  @DisplayName("Prueba General")
	  void testCalculadoraBasic() {
		  int num1=4;
		  int num2=1;
		  assertEquals(num1+num2,basicCalc.suma(num1, num2));
		  System.out.println("Se hizo la suma correctamente");
		  assertEquals(num1-num2,basicCalc.resta(num1, num2));
		  System.out.println("Se hizo la resta correctamente");
		  assertEquals(num1*num2,basicCalc.multiplicacion(num1, num2));
		  System.out.println("Se hizo la multiplicacion correctamente");
		  assertEquals(4 ,basicCalc.division(num1, num2));
		  System.out.println("Se hizo la division correctamente");
		  
	  }
	  
	  @Test
	  @DisplayName("Prueba con mockito")
		public void CalculadoraTestMockito(){
		  	System.out.println("Prueba con Mockito");
			Calculadora calc= mock(Calculadora.class);
			
			when(calc.suma(5,5)).thenReturn(30);
		    assertEquals(30,calc.suma(5, 5));

			when(calc.resta(4, 2)).thenReturn(10);
		    assertEquals(10,calc.resta(4, 2));

			when(calc.multiplicacion(3, 3)).thenReturn(80);
		    assertEquals(80,calc.multiplicacion(3, 3));

			when(calc.division(20, 2)).thenReturn(3);
		    assertEquals(3,calc.division(20, 2));
		
		}

	  /*
	  @Test
	  @DisplayName("Prueba Metodo Suma")
	  void testCalculadoraSuma() {
		  int num1=8;
		  int num2=4;
		  assertEquals(12,basicCalc.suma(num1, num2));
	  }
	  
	  @Test
	  @DisplayName("Prueba Metodo Resta")
	  void testCalculadoraResta() {
		  int num1=8;
		  int num2=4;
		  assertEquals(4,basicCalc.resta(num1, num2));
	  }
	  
	  @Test
	  @DisplayName("Prueba Metodo Resta")
	  void testCalculadoraMultiplicacion() {
		  int num1=8;
		  int num2=4;
		  assertEquals(32,basicCalc.multiplicacion(num1, num2));
	  }
	  */
	 /*
	  @Test
	  @DisplayName("Prueba Metodo Resta")
	  void testCalculadoraDivision() {
		  int num1=4;
		  int num2=8;
		  assertEquals(num1/num2,basicCalc.division(num1, num2));
	  }*/	  
}
