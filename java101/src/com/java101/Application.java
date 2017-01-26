package com.java101;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class Application {
	
	public static void main(String[] params) throws ParseException, IOException {
		HeroService hero = new HeroService();
		hero.createAndShowHeroesLogFromHeroesList();
	}

}
