package com.skilldistillery.game.app;

import com.skilldistillery.game.entities.FoodItems;
import com.skilldistillery.game.entities.Guide;
import com.skilldistillery.game.entities.Player;
import com.skilldistillery.game.entities.Snipe;
import com.skilldistillery.game.entities.SnipeType;

public class GameApp {
	public static void main(String[] args) {
		GameApp game = new GameApp();
		game.run();
	}

	public void run() {

		Guide guide = new Guide(" ");
		Player player = new Player("Hunter", 100);
		
		// Guide welcomes player to the game and explains the rules
		guide.printRules();

		// welcome the player and have them introduce themselves
		System.out.println("\n\nWelcome to your Snipe Hunt " + player.getName() + "!\n");
		System.out.println("You are starting your game off with " + player.getHealthPoints() + " healthpoints\n");
		
		
		// Start the hunt
		player.startTheHunt();

		// Simulate snipe attack
		// this should be inside the startTheHunt
		//snipe.damage(player);

		// Check player's health and allow healing
		if (player.getHealthPoints() > 0) {
			player.heal(player);
		} else {
			player.die();
		}

	}

}