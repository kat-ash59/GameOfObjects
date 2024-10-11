package com.skilldistillery.game.entities;

// This class is not part of the MVP
public class Light extends Equipment 
{

	private Brightness brightnessLevel;

	public Light(String name) 
	{
		super(name);
		brightnessLevel = Brightness.MEDIUM;

	}
	
	public Light(String name, Brightness brightnessLevel)
	{
		super(name);
		this.brightnessLevel = brightnessLevel;
	}

	public void changeBrightnessLevel(Brightness brightnessLevel) 
	{
		this.brightnessLevel = brightnessLevel;
	}
	
	public Light getLight()
	{
		Light myLight = new Light(this.name,this.brightnessLevel);
		return myLight;
	}

}
