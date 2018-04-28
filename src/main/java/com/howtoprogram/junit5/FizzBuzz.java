package com.howtoprogram.junit5;

public class FizzBuzz {
	
	String[] ListaFB(int a, int b) {

		String[] fb = {};
	
		for(int i=a;i==b;i++) {

			if(i%3==0 && i%5==0) {
				fb[i]="FizzBuzz";
			}else if(i%3==0) {
				fb[i]="Fizz";
			}else if(i%5==0) {
				fb[i]="Buzz";
			}else {
				fb[i]=Integer.toString(i);
			}
		}
		return fb;
	}

}
