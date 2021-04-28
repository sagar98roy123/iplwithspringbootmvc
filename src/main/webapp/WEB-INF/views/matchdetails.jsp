<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>${matchDataList.team1} VS ${matchDataList.team2}</title>
</head>
<body>
	<h1>${matchDataList.team1} VS ${matchDataList.team2}</h1>
	<h4>Place:${matchDataList.city}</h4>
	<h4>Date:${matchDataList.date}</h4>
	<h4>Player of the Match:${matchDataList.player_of_match}</h4>
	<h4>Venue:${matchDataList.venue}</h4>
	<h4>${matchDataList.toss_winner} won the toss and choose to ${matchDataList.toss_decision}</h4>
	<h4>Winner:${matchDataList.winner}</h4>
	<h4>Winning margin:${matchDataList.result_margin} ${matchDataList.result}</h4>
	<h4>Umpires: ${matchDataList.umpire1 } and ${matchDataList.umpire2}</h4>
</body>
</html>