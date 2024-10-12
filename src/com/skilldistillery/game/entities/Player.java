package com.skilldistillery.game.entities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player extends Character {

	private int healthPoints = 100;
	private Guide guide;
	private Snipe snipe;
	private Storage<FoodItems> backpack;
	private Scanner scanner;

	public Player(String name, int healthPoints, Scanner scanner) {
		super(name);
		this.healthPoints = healthPoints;
		this.scanner = scanner;
		guide = new Guide(scanner);
		backpack = new Storage<>("backpack");
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void startTheHunt() {
		// Choose snipe type through the guide
		SnipeType chosenSnipeType = guide.queryThePlayer();
		System.out.println("You chose to hunt the " + chosenSnipeType + " snipe.");

		// Create the snipe to hunt
		snipe = new Snipe("Wild " + chosenSnipeType, chosenSnipeType);

		// gather our equipment
		collectEquipment();

		// encounter the snipe here, heal yourself or quit?
		while (healthPoints > 0 && encounterSnipe(snipe)) {
			// Allow healing after each encounter
			heal(FoodItems.getRandomFood());
		}
	}

	public void setATrap(ArrayList<FoodItems> food) {

	}

	public String pickSnipeType() {
		return null;

	}

	/**
	 * 
	 */
	public void collectEquipment() {

		System.out.println("Collecting items for your hunt...");
		System.out.print("How many food items would you like to collect (1-10)?: ");
		int numItems = scanner.nextInt();

		// Add Food to the backpack
		for (int i = 0; i < numItems; i++) {
			backpack.addItem(FoodItems.getRandomFood());
		}

		// Display items added to backpack
		backpack.displayItems();

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

		//
		System.out.println("You encounter a " + snipe.getSnipeType() + " snipe!");

		// set up random attacked by snipe or catch snipe
		Random random = new Random();
		int randomNumber = random.nextInt(4);
		
		if (randomNumber == 0)
		{
			getAttacked();
		}
		else if (randomNumber == 1)
		{
			runAway();
		}
		else if (randomNumber == 2)
		{
			catchSnipe();
		}
		else
		{
			giveUp();
		}
		getWarnings();

		// Check if player is still alive
		if (healthPoints <= 0) {
			System.out.println("You have died. Game over.");
			die(); // Player has died
			return false;
		}

		return true; // Player is still alive and can continue
	}

	public void makeSound() {

	}

	public void setTrap(ArrayList<FoodItems> food) {

	}

	/**
	 * 
	 * @param food
	 */
	public void heal(FoodItems food) {
		int healthRestored = food.getNumberOfHealthsPoints();
		healthPoints += healthRestored;
		System.out.println("You consumed " + food + " and restored " + healthRestored + " health points.");
		getWarnings(); // Update player on health status
	}

	public void runAway() {
	    System.out.println("You sprint away from the " + snipe.getSnipeType() + " snipe!");
	    
	    // A penalty for running away?
	    int penalty = 5;
	    healthPoints -= penalty;
	    System.out.println("You lost " + penalty + " health points in your frantic escape.");
	    
	    if (healthPoints > 0) {
	        System.out.println("You've managed to escape, but the hunt isn't over yet...");
	    }
	}
	public void giveUp() {
	    System.out.println("You decide the hunt is too dangerous and surrender.");
	    System.out.println("The wild " + snipe.getSnipeType() + " watches as you retreat in defeat.");
	    System.out.println("Game over. Better luck next time!");
	    System.exit(0);
	}

	/**
	 * 
	 */
	public void die() {
		System.out.println("Game Over. You have been defeated.");
		System.exit(0); 

	}

	public void catchSnipe() {
		    System.out.println("Congratulations! You've successfully caught the " + snipe.getSnipeType() + " snipe!");
		    System.out.println("The snipe looks at you with admiration...");
		    snipe.getCaught();
	}
	
	public void getAttacked()
	{
		// Snipe attacks the player
		int damage = snipe.damage();
		healthPoints -= damage;
		System.out.println("The snipe dealt " + damage + " damage. You now have " + healthPoints + " health points.");

	}

	/**
	 * Based on the player health points value, prints warnings.
	 */
	public void getWarnings() {
		if (this.healthPoints <= 0) {
			die();
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
