package com.skilldistillery.game.entities;

import java.util.ArrayList;

public class Player extends Character {
	
	private int healthPoints;

	public Player(String name, int healthPoints) {
		super(name);
		this.healthPoints = healthPoints;
	
	}
	
	public int getHealthPoints() {
		return  healthPoints;
		
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	
	public void startTheHunt(ArrayList<String> equipment, Snipe snipe) {
		
	}
	
	public void setATrap(ArrayList<FoodItems> food) {
		
	}
	
	public String  pickSnipeType() {
		return null;
		
	}
	
	public ArrayList<Equipment> collectEquipment() {
		return null;
		
	}
	
	public void makeSound() {
		
	}
	
	public void  setTrap(ArrayList<FoodItems> food) {
		
	}
	
	public int  heal(FoodItems food) {
		return 0;
		
	}
	
	public void  runAway() {
		
	}
	
	public void  giveUp() {
		
	}
	
	public void  die() {
		
	}
	
	public void catchSnipe() {
		
	}
	
	public void  getWarnings(int healthPoints) {
		
	}

}
