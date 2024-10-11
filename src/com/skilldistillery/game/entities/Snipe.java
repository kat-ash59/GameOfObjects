package com.skilldistillery.game.entities;

public class Snipe extends Character{
	
	private SnipeType snipe;

	public Snipe(String name, SnipeType snipe) {
		super(name);
		this.snipe = snipe;
	}
		
	public void hide() {
		
	}
	public int damage(Player player) {
		return 0;
	}
	
	public void  getCaught() {
		
	}
	
	public void  grantWish() {
		
	}

	public SnipeType getSnipeType() {
		
		return snipe;
	}

}
