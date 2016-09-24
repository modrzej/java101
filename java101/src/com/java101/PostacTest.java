package com.java101;

import java.util.Scanner;

public class PostacTest {
	
	public static void main(String args[]) {
		
		Scanner odczyt = new Scanner(System.in);
		
		int sila, zrecznosc, witalnosc;
		
		System.out.println("Podaj si³ê bohatera:"); 
		
		do {
			sila = odczyt.nextInt();
			if(sila> 100 || sila < 0) {
				System.out.println("Niepoprawne dane. Mo¿na podaæ tylko liczbê z zakresu 1-100. Podaj ponownie si³ê bohatera");
			}
		} while (sila > 100 || sila < 0);		
		
		System.out.println("Podaj zrêcznoœæ bohatera:"); 
		
		do {
			zrecznosc = odczyt.nextInt(); 
			if(zrecznosc > 100 || zrecznosc < 0 ) {
				System.out.println("Niepoprawne dane. Mo¿na podaæ tylko liczbê z zakresu 1-100. Podaj ponownie zrêcznoœæ bohatera");
			}
		} while (zrecznosc > 100 || zrecznosc < 0);
		
		
		System.out.println("Podaj witalnoœæ bohatera:"); 
		
		do {
			witalnosc = odczyt.nextInt(); 
			if(witalnosc > 100 || witalnosc < 0 ) {
				System.out.println("Niepoprawne dane. Mo¿na podaæ tylko liczbê z zakresu 1-100. Podaj ponownie witalnoœæ bohatera");
			}
		} while(witalnosc > 100 || witalnosc < 0);

		System.out.println("Si³a: "+sila+"\nZrêcznoœæ: "+zrecznosc+"\nWitalnoœæ: "+witalnosc);
	}
	
}
