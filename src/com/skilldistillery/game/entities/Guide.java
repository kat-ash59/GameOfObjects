package com.skilldistillery.game.entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Guide extends Character {

	public Guide(String name) {
		super(name);
	} 
	
	
	public Guide() {
		super(name);
	}
	
	
	public void Guide() {
		Guide myGuide = new Guide("Your Friendly Snip Hunt Guide: Bob");
	} // end constructor Guide

	public void printRules() {
		System.out.println("Welcome to the Snipe Hunt!");
		System.out.println("Today we will be sending you off on a fun Snipe Hunt\n"
				+ "\t1) You will be choosing what type of Snipe to hunt,\n"
				+ "\t2) You will be equiping yourself with the latest Snip Hunting gear\n"
				+ "\t\tand venturing out into the wilds to catch your Snipe."
				+ "\t3)The Snip may cause harm when you are hunting them\n"
				+ "\t\tyou will need to eat or drink something to regain your health.\n"
				+ "\t4) If you die you will be thrown out of the Snipe Hunt"
				+ "\t5) If you catch the Snipe the Snip will grant you a wish and you win the game!\n"
				+ "Enjoy yourself and have fun!");
	} // end printRules

	public SnipeType queryThePlayer() {
		Scanner keyboard = new Scanner(System.in);
		String keepGoing = "Y";

		while (keepGoing.toUpperCase().equals("Y")) {
			System.out.println("What type of Snipe would you like to hunt today?\t");
			System.out.println("\t1. The elusive Gutter Snipe which can be found in the Sewer systems of your City");
			System.out.println("\t2. The extremely wild Forest Snipe which can be found in our National Forests");
			System.out.println("\t3. The shy Great Plains Snip which is found in our vast Plains");
			System.out.print("\tPlease enter 1, 2, or 3");
			try {
				int number = keyboard.nextInt();
				if ((number < 1) || (number > 3)) {
					System.out.println("Please enter a number between 1 and 3");
				}
			} // end try
			catch (InputMismatchException e) {
				System.out.println("Invalid input.");
				keyboard.nextLine(); // Clear input buffer
			} // end catch

		}
		
		String snipeType = "Snipe Type";
		return null;
	}

	public void printEquipmentList() {
		System.out.println("not implemented yet");
	}

} // end class Guide