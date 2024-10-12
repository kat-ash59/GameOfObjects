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
		//FIXME damage should return a damage value and not handle modify the state of Player 
		Random random = new Random(); 
	    int damage = (random.nextInt(3) + 1) * 10;  // random number from 0-2 and damage: 10, 20, or 30
	    return damage;
	}

	public void getCaught() {
		grantWish();
		System.out.println("Thank-you for playing our Snip Hunt Game!!!");
		System.out.println("Hope you had a great time!");
		System.exit(0);
	}

	public void grantWish() {
		System.out.println("Darn it you caught me!!!\n");
		System.out.println("I will now grant you one wish\n");
		System.out.println("Say your wish to yourself .... and count to 3\n");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n\nYour Wish Is Granted!!!!\n\n");
	}

	public SnipeType getSnipeType() {
		return snipe;
	}
}
