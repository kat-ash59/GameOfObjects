package com.skilldistillery.game.entities;

import java.util.Random;

public class Snipe extends Character {

	private SnipeType snipe;

	public Snipe(String name, SnipeType snipe) {
		super(name);
		this.snipe = snipe;
	}

	public void hide() {
		System.out.println("OHHHH!!!! The Snipe vanished into thin air!");
	}

	public int damage() {

		Random random = new Random();
		int damage = (random.nextInt(3) + 1) * 10; // random number from 0-2 and damage: 10, 20, or 30
		return damage;
	}

	public void getCaught() {
		System.out.println("Darn it! You caught me!!!");
		grantWish();
		System.out.println("Thank-you for playing our Snipe Hunt Game!");
		System.out.println("Hope you had a great time!");
		System.exit(0);
	}

	public void grantWish() {
		System.out.println("As promised, I will grant you one wish...\n");
		System.out.println("Close your eyes and say your wish aloud. I’ll count to 3...\n");
		try {
			Thread.sleep(2000); // Wait is 2 seconds
			System.out.println("1...");
			Thread.sleep(1000); // Wait 1 second between counts
			System.out.println("2...");
			Thread.sleep(1000);
			System.out.println("3...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\n\nYour Wish Is Granted!!!\n\n");
	}

	public SnipeType getSnipeType() {
		return snipe;
	}
}
