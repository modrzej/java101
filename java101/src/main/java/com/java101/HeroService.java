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

	public List<Hero> createHeroesListFromJsonFile() throws IOException, ParseException {

		List<Hero> heroesList = new ArrayList<>();

		JSONArray allHeroes = getDataFromStaticJSonFile();

		for (int i = 0; i < allHeroes.size(); i++) {
			JSONObject heroesFromJson = (JSONObject) allHeroes.get(i);
			Hero hero = createHeroFrom(heroesFromJson);
			heroesList.add(hero);
		}

		return heroesList;
	}

	private Hero createHeroFrom(JSONObject heroesFromJson) {
		Hero hero = new Hero();
		hero.setName((String) heroesFromJson.get("name"));
		hero.setPower((Long) heroesFromJson.get("power"));
		hero.setSkill((Long) heroesFromJson.get("skill"));
		hero.setVitality((Long) heroesFromJson.get("vitality"));
		return hero;
	}

	private JSONArray getDataFromStaticJSonFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();

		FileReader fileReader = new FileReader("D:/Nauka programowania/brat/REPO/heroes.txt");

		JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

		JSONArray allHeroes = (JSONArray) jsonObject.get("heroes");

		return allHeroes;
	}
}
