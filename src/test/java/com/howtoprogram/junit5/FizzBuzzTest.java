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

public class FizzBuzzTest {
	
	//private FizzBuzz fb=new FizzBuzz();
	
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
	  @DisplayName("Prueba con mockito")
		public void FizzBuzzTestMockito(){
		  	System.out.println("Prueba con Mockito");
			FizzBuzz fb= mock(FizzBuzz.class);
			String[] fzbz= {"1","2","Fizz","4","Buzz"};
			
			String[] fzbz2= {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz"};
			
			when(fb.ListaFB(1, 5)).thenReturn(fzbz);
		    assertEquals(fzbz,fb.ListaFB(1, 5));
		    
		    when(fb.ListaFB(1, 9)).thenReturn(fzbz2);
		    assertEquals(fzbz2,fb.ListaFB(1, 9));
		}
	  
	  @Test
	  @DisplayName("Prueba con mockito falla")
		public void FizzBuzzTestMockitoFalla(){
		  	System.out.println("Prueba con Mockito");
			FizzBuzz fb= mock(FizzBuzz.class);
						
			String[] fzbz1= {"1","2","3","4","5","Fizz","7","8","Fizz"};
					    
		    when(fb.ListaFB(5, 1)).thenReturn(fzbz1);
		    assertEquals(fzbz1,fb.ListaFB(5, 1));
		}
}
