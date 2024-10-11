package com.skilldistillery.game.entities;

import java.util.ArrayList;

public class Player extends Character {

	private int healthPoints;

	public Player(String name, int healthPoints) {
		super(name);
		this.healthPoints = healthPoints;

	}

	public int getHealthPoints() {
		return healthPoints;

	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void startTheHunt(ArrayList<Equipment> equipment, Snipe snipe) {
		//TODO
		// what snipe type we hunt -> handle by Guide class
		
		
		
		// gather our equipment
		collectEquipment();
	}

	public void setATrap(ArrayList<FoodItems> food) {

	}

	public String pickSnipeType() {
		return null;

	}

	public ArrayList<Equipment> collectEquipment() {
		return null;

	}

	/**
	 * Simulates an interaction between the player and a snipe during the hunt.
	 * 
	 * @param snipe The snipe the player is encountering
	 * @return true if the encounter continues (i.e., the player is still alive and
	 *         the hunt can go on), or false if the player’s health reaches 0
	 *         (indicating the player has died).
	 */
	public boolean encounterSnipe(Snipe snipe) {
		System.out.println("You encounter a " + snipe.getSnipeType() + " snipe!");

		// Snipe attacks the player
		int damage = snipe.damage(this);
		healthPoints -= damage;
		System.out.println("The snipe dealt " + damage + " damage. You now have " + healthPoints + " health points.");

		// Check if player is still alive
		if (healthPoints <= 0) {
			System.out.println("You have died. Game over.");
			return false; // Player has died
		}

		return true; // Player is still alive and can continue
	}

	public void makeSound() {

	}

	public void setTrap(ArrayList<FoodItems> food) {

	}

	public int heal(FoodItems food) {
		//TODO
		return 0;

	}

	public void runAway() {

	}

	public void giveUp() {

	}

	public void die() {

	}

	public void catchSnipe() {

	}

	/**
	 * Based on the player health points value, prints warnings.
	 */
	public void getWarnings() {
		if (this.healthPoints <= 0) {
			System.out.println("You have died. Game Over");
			System.exit(0);
			
		} else if (this.healthPoints <= 9 && this.healthPoints >= 1) {
			System.out.println("You’re on the brink of death! Do something, quick!");
			
		} else if (this.healthPoints <= 24 && this.healthPoints >= 10) {
			System.out.println("You’re badly wounded! One more hit could be fatal.");
			
		} else if (this.healthPoints <= 49 && this.healthPoints >= 25) {
			System.out.println("Your health is low. You should find a way to recover soon.");
			
		} else if (this.healthPoints <= 74 && this.healthPoints >= 50) {
			System.out.println("You feel a bit tired. Keep an eye on your health.");
			
		} else if (this.healthPoints <= 99 && this.healthPoints >= 75) {
			System.out.println("You’re in good shape, but don’t get too careless.");
			
		} else if (this.healthPoints == 100) {
			System.out.println("You’re feeling strong and ready for anything!");
		}
	}

}
