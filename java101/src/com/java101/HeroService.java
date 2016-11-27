package com.java101;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;;

public class HeroService {

	public void createHero() throws ParseException, IOException {

		List<Hero> listaBohaterow = new ArrayList<>();

		JSONParser jsonParser = new JSONParser();

		FileReader fileReader = new FileReader("D:/Nauka programowania/brat/REPO/heroes.txt");

		JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

		JSONArray allCards = (JSONArray) jsonObject.get("heroes");

		for (int i = 0; i < allCards.size(); i++) {
			JSONObject heroesy = (JSONObject) allCards.get(i);
			Hero hero = new Hero();
			hero.setName((String) heroesy.get("name"));
			hero.setPower((Long) heroesy.get("power"));
			hero.setSkill((Long) heroesy.get("skill"));
			hero.setVitality((Long) heroesy.get("vitality"));
			listaBohaterow.add(hero);
		}

		if (listaBohaterow != null && listaBohaterow.size() != 0) {
			for (int i = 0; i < listaBohaterow.size(); i++) {
				System.out.println(listaBohaterow.get(i));
			}
		}
	}
}
