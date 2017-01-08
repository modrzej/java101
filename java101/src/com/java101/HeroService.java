package com.java101;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;;

public class HeroService {

	public void showHero() throws ParseException, IOException {

		List<Hero> heroesList = createHeroesList();

		if (heroesList != null && heroesList.size() != 0) {
			for (int i = 0; i < heroesList.size(); i++) {
				System.out.println(heroesList.get(i));
			}
		}
	}

	public List<Hero> createHeroesList() throws IOException, ParseException {

		List<Hero> heroesList = new ArrayList<>();

		JSONArray allHeroes = getDataFromStaticJSonFile();

		for (int i = 0; i < allHeroes.size(); i++) {
			JSONObject heroesy = (JSONObject) allHeroes.get(i);
			Hero hero = new Hero();
			hero.setName((String) heroesy.get("name"));
			hero.setPower((Long) heroesy.get("power"));
			hero.setSkill((Long) heroesy.get("skill"));
			hero.setVitality((Long) heroesy.get("vitality"));
			heroesList.add(hero);
		}

		return heroesList;
	}

	public JSONArray getDataFromStaticJSonFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();

		FileReader fileReader = new FileReader("D:/Nauka programowania/brat/REPO/heroes.txt");

		JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

		JSONArray allHeroes = (JSONArray) jsonObject.get("heroes");

		return allHeroes;
	}
}
