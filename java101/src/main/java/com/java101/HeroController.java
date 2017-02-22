package com.java101;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeroController {

	@RequestMapping("/heroes")
	public String heroes(Model model) throws IOException, ParseException {
		HeroService heroService = new HeroService();
		List<Hero> heroes = heroService.createHeroesListFromJsonFile();
		model.addAttribute("heroes", heroes);
		return "heroes";
	}

}
