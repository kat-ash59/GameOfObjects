package com.skilldistillery.game.entities;

public abstract class Character {
	protected final String name;
	
	public Character(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
