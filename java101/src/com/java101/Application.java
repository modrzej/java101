package com.java101;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

	@RequestMapping("/")
	@ResponseBody
	public void showHeroesLogWithWeb() throws ParseException, IOException {
		HeroService hero = new HeroService();
		hero.createHeroesLogFromHeroesList();
	}
	
	public static void main(String[] params) throws ParseException, IOException {
		System.getProperties().put( "server.port", 81 );
		SpringApplication.run(Application.class, params);
	}

}
