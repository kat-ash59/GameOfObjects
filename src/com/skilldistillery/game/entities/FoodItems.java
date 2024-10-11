package com.skilldistillery.game.entities;

public enum FoodItems {

	COFFEE(10), CANDY(5), CINNAMON(10), EXPRESSO(20);

	private final int numberOfHealthsPoints;
	private boolean debug = true;

	FoodItems(int numberOfHealthsPoints) 
	{
		if (debug == true)
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println(food);
			}
		}
		this.numberOfHealthsPoints = numberOfHealthsPoints;
	}

	public int getNumberOfHealthsPoints() 
	{
		return numberOfHealthsPoints;
	}
}
