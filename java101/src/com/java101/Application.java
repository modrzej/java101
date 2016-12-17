package com.java101;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Application {

	public static void main(String[] params) throws ParseException, IOException {

		HeroService hero = new HeroService();

		hero.showHero();
	}
}
