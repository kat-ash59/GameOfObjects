package com.skilldistillery.game.app;

public class GameApp {
	public static void main(String[] args) {
		GameApp game = new GameApp();
		game.run();
	} // end main

	public void run() {

		Guide guide = new Guide();
		Player player = new Player("Hunter", 100);

		// Guide asks player to choose snipe type
		SnipeType snipeType = guide.queryThePlayer();
		Snipe snipe = new Snipe("Sneaky", snipeType);

		// Start the hunt
		player.startTheHunt();

		// Simulate snipe attack
		snipe.damage(player);

		// Check player's health and allow healing
		if (player.getHealthPoints() > 0) {
			player.heal(FoodItems.COFFEE);
		} else {
			player.die();
		}

	} // end method run

} // end class GameApp