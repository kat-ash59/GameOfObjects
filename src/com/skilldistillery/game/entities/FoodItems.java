package com.skilldistillery.game.entities;

public enum FoodItems {

	COFFEE(10), CANDY(5), CINNAMON(10), EXPRESSO(20);

	private final int numberOfHealthsPoints;
	

	FoodItems(int numberOfHealthsPoints) 
	{
		this.numberOfHealthsPoints = numberOfHealthsPoints;
	}

	public int getNumberOfHealthsPoints() 
	{
		return numberOfHealthsPoints;
	}
}