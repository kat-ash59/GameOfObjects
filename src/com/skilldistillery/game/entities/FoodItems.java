package com.skilldistillery.game.entities;

import java.util.Random;

public enum FoodItems {

	BURGER(30), COFFEE(10), CANDY(5), CINNAMON(10), EXPRESSO(20);

	private final int numberOfHealthsPoints;

	FoodItems(int numberOfHealthsPoints) {
		this.numberOfHealthsPoints = numberOfHealthsPoints;
	}

	public int getNumberOfHealthsPoints() {
		return numberOfHealthsPoints;
	}

	/**
	 * Randomly select a food item.
	 * 
	 * @return A random food from the list of food.
	 */
	public static FoodItems getRandomFood() {
		Random random = new Random();
		FoodItems[] FoodItemsList = FoodItems.values();
		return FoodItemsList[random.nextInt(FoodItemsList.length)];
	}

}
