package com.java101;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeroController {

	private List<Hero> heroes;

	@Autowired
	private HeroService heroService;

	@PostConstruct
	public void init() throws IOException, ParseException {
		heroes = heroService.createHeroesListFromJsonFile();
	}

	@RequestMapping(value = "/heroes", method = RequestMethod.GET)
	public String heroes(Model model) throws IOException, ParseException {
		model.addAttribute("heroes", heroes);
		return "heroes";
	}

	@RequestMapping(value = "/addHero", method = RequestMethod.GET)
	public String addHeroForm(Model model) {
		return "addHero";
	}

	@RequestMapping(value = "/addHero", method = RequestMethod.POST)
	public String add(@ModelAttribute("hero") Hero hero) {
		
		boolean check = hero.checkNewHero(hero);
		
		if (check=true) {

			synchronized (heroes) {
			heroes.add(hero);
			}
		}
		return "redirect: heroes";
	}

}
