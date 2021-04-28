package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.MatchData;
import com.example.demo.repository.MatchRepository;

@Controller
public class HomeController {
	
	@Autowired
	private MatchRepository matchRepo;
	
	@GetMapping("/home")
	public ModelAndView showHomePage(ModelAndView modelAndView) {
		
		modelAndView.setViewName("homepage");
		return modelAndView;
	}
	
	
	@GetMapping("/team/{teamName}")
	public ModelAndView showTeamDetails(ModelAndView modelAndView,@PathVariable String teamName) {
		modelAndView.setViewName("teamlanding");
		modelAndView.addObject("teamName", teamName);
		return modelAndView;
	}
	
	@RequestMapping("/team/{teamName}/{season}")
	public ModelAndView showSeasonDetails(ModelAndView modelAndView,@PathVariable("teamName") String teamName,@PathVariable("season") Integer season) {
		modelAndView.setViewName("seasonlanding");
		modelAndView.addObject("teamName", teamName);
		modelAndView.addObject("season", season);
		List<MatchData> seasonDataList=(List<MatchData>)matchRepo.findByTeamAndSeason(teamName, season);
		modelAndView.addObject("seasonData", seasonDataList);
		System.out.println(seasonDataList.size());
		return modelAndView;
	}
	
	@GetMapping("/{id}")
	public ModelAndView showMatchDetails(ModelAndView modelAndView,@PathVariable Integer id) {
		modelAndView.setViewName("matchdetails");
		Optional<MatchData> data =matchRepo.findById(id);
		modelAndView.addObject("matchDataList", data.get());
		System.out.println(data.get());
		return modelAndView;
	}
}
