package com.skilldistillery.game.entities;

import java.util.ArrayList;
import java.util.Random;

public class Snipe extends Character
{
	
	private SnipeType snipe;

	public Snipe(String name, SnipeType snipe) 
	{
		super(name);
		this.snipe = snipe;
	}
		
	public void hide() 
	{
		System.out.println("OHHHH!!!! The Snipe vanished into thin air!");
	}
	
	public int damage(Player player) 
	{
		int randomIndex = 0;
		Random randomNumber = new Random();
		int healthPoints = player.getHealthPoints();
		
		randomIndex = randomNumber.nextInt(3);
		if (randomIndex == 1)
		{
			healthPoints-=10;
		}
		else if (randomIndex == 2)
		{
			healthPoints-=20;
		}
		else
		{
			healthPoints-=30;
		}
		
		
		return healthPoints;
	}
	
	public void  getCaught() 
	{
		grantWish();
		System.out.println("Thank-you for playing our Snip Hunt Game!!!");
		System.out.println("Hope you had a great time!");
		System.exit(0);
	}
	
	public void  grantWish() 
	{
		System.out.println("Darn it you caught me!!!");
		System.out.println("I will now grant you one wish");
		System.out.println("Say your wish to yourself ....");
		try 
		{
			Thread.sleep(20);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n\nYour Wish Is Granted!!!!\n\n");
	}

	public SnipeType getSnipeType() 
	{
		return snipe;
	}
}
