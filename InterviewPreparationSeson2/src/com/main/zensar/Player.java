package com.main.zensar;

import java.util.Set;

public class Player {
	private String name;
	private String day;
	private Set<String> games;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getDay() {
		return day;
	}
	public Set<String> getGames() {
		return games;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setGames(Set<String> games) {
		this.games = games;
	}
	
	public Player(String name, String day, Set<String> games, String id) {
		super();
		this.name = name;
		this.day = day;
		this.games = games;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", day=" + day + ", games=" + games + ", id=" + id + "]";
	}
	
	

}
