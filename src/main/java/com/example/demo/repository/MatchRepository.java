package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.MatchData;

public interface MatchRepository extends CrudRepository<MatchData, Integer> {
	
	@Query("select md from MatchData md where (md.team1=:team or md.team2=:team) and extract (year from date)=:season order by date desc")
	List<MatchData> findByTeamAndSeason(@Param(value = "team") String team,@Param(value = "season") Integer season);
}
