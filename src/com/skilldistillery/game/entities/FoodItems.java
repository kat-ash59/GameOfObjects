package com.skilldistillery.game.entities;

public enum FoodItems {

	COFFEE(0), CANDY(0), CINNAMON(0), EXPRESSO(0);

	private final int numberOfHealthsPoints;

	FoodItems(int numberOfHealthsPoints) {
		this.numberOfHealthsPoints = numberOfHealthsPoints;
	}

	public int getNumberOfHealthsPoints() {
		return numberOfHealthsPoints;
	}
}
