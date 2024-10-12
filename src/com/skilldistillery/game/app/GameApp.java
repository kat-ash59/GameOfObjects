package com.skilldistillery.game.app;

import java.util.Scanner;

import com.skilldistillery.game.entities.FoodItems;
import com.skilldistillery.game.entities.Guide;
import com.skilldistillery.game.entities.Player;
import com.skilldistillery.game.entities.Snipe;
import com.skilldistillery.game.entities.SnipeType;

public class GameApp {

	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		GameApp game = new GameApp();

		game.run();

		scanner.close();
	}

	public void run() {

		// Initialize Guide and Player
		Guide guide = new Guide(scanner);
		Player player = new Player("Hunter", 100, scanner);

		// Guide welcomes player and explains the rules
		guide.printRules();

		// Start Game Introduction
		System.out.println("\nWelcome to your Snipe Hunt, " + player.getName() + "!");
		System.out.println("You start the game with " + player.getHealthPoints() + " health points.\n");

		// Start the hunting process
		player.startTheHunt();

		// After the hunt, check player's status
		if (player.getHealthPoints() > 0) {
			System.out.println("\nCongratulations, you survived the hunt!");
		} else {
			System.out.println("\nGame Over! Better luck next time.");
		}

	}

}