package com.java101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] params) {
		List<Hero> listaBohaterow = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		int number;
		
		do{
		System.out.println("Wybierz jedn¹ opcjê: \nWprowadz bohatera - 1 \nNic nie rób - 0");
		number = scan.nextInt();
		
			switch(number) {
			case 1:
				System.out.println("Podaj imiê bohatera");
				String name = scan.next();
				System.out.println("Podaj si³ê bohatera");
				int sila = scan.nextInt();
				System.out.println("Podaj zrêcznoœæ bohatera");
				int zrecznosc = scan.nextInt();
				System.out.println("Podaj witalnoœæ bohatera");
				int witalnosc = scan.nextInt();
				Hero bohater = new Hero();
				bohater.setName(name); 
				bohater.setPower(sila);
				bohater.setSkill(zrecznosc);
				bohater.setVitality(witalnosc);
				listaBohaterow.add(bohater);
				System.out.println("Podany bohater: " + "\nImiê: " + name + ", Si³a: " + sila + ", Zrêcznoœæ: " + zrecznosc + ", Witalnoœæ: " + witalnosc); 
				break;
			case 0:
				break;
			default:
				break;
			}
		}while(number !=0);
		
		if(listaBohaterow != null && listaBohaterow.size() != 0) {
			for(int i = 0; i < listaBohaterow.size(); i++) {
				System.out.println(listaBohaterow.get(i));
			}
		}
	}
}
