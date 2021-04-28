package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MatchData;
import com.example.demo.repository.MatchRepository;

@RestController
@RequestMapping("/matches")
public class MatchController {
	@Autowired
	private MatchRepository matchRepo;
	
	@PostMapping("/saveMatches")
	public String saveMatches(@RequestBody List<MatchData> matches) {
		matchRepo.saveAll( matches);
		return "Total entry"+matches.size();
	}
	
	@GetMapping("/getMatches")
	public List<MatchData> getMatches(){
		return (List<MatchData>)matchRepo.findAll();
	}
	
	@GetMapping("/getMatches/{team}/{season}")
	public List<MatchData> getSpecificMatches(@PathVariable("team") String team ,@PathVariable("season") Integer season ){
		return (List<MatchData>)matchRepo.findByTeamAndSeason(team, season);
	}
}
