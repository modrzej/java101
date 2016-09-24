package com.java101;

import java.util.Scanner;

public class PostacTest {
	
	public static void main(String args[]) {
		
		Scanner odczyt = new Scanner(System.in);
		
		int sila, zrecznosc, witalnosc;
		
		System.out.println("Podaj si�� bohatera:"); 
		
		do {
			sila = odczyt.nextInt();
			if(sila> 100 || sila < 0) {
				System.out.println("Niepoprawne dane. Mo�na poda� tylko liczb� z zakresu 1-100. Podaj ponownie si�� bohatera");
			}
		} while (sila > 100 || sila < 0);		
		
		System.out.println("Podaj zr�czno�� bohatera:"); 
		
		do {
			zrecznosc = odczyt.nextInt(); 
			if(zrecznosc > 100 || zrecznosc < 0 ) {
				System.out.println("Niepoprawne dane. Mo�na poda� tylko liczb� z zakresu 1-100. Podaj ponownie zr�czno�� bohatera");
			}
		} while (zrecznosc > 100 || zrecznosc < 0);
		
		
		System.out.println("Podaj witalno�� bohatera:"); 
		
		do {
			witalnosc = odczyt.nextInt(); 
			if(witalnosc > 100 || witalnosc < 0 ) {
				System.out.println("Niepoprawne dane. Mo�na poda� tylko liczb� z zakresu 1-100. Podaj ponownie witalno�� bohatera");
			}
		} while(witalnosc > 100 || witalnosc < 0);

		System.out.println("Si�a: "+sila+"\nZr�czno��: "+zrecznosc+"\nWitalno��: "+witalnosc);
	}
	
}
