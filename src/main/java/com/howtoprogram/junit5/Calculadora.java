package com.howtoprogram.junit5;

public class Calculadora {
	
	int suma(int a, int b) {
		return a+b;
	}
	
	int resta(int a, int b) {
		return a-b;
	}
	
	int multiplicacion(int a, int b) {
		return a*b;
	}
	
	int division(int a, int b) {
		int res= a==0||b==0?0:a/b;
		return res;
	}

}
