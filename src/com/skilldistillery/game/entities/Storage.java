package com.skilldistillery.game.entities;

import java.util.ArrayList;

public class Storage<T> extends Equipment {
	
	private ArrayList<T> items;

	public Storage(String name) {
		super(name);
	}

	public ArrayList<T> addItem(T item) {
		return null;
		
	}
	
	public ArrayList<T> removeItem(T item) {
		return null;
	}
}
