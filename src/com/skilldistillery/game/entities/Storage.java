package com.skilldistillery.game.entities;

import java.util.ArrayList;

public class Storage<T> extends Equipment {

	private ArrayList<T> items;

	public Storage(String name) {
		super(name);
	}

	public ArrayList<T> addItem(T item) {
		this.items.add(item);
		return this.items;

	}

	public ArrayList<T> removeItem(T item) {
		this.items.remove(item);
		return this.items;
	}

	public ArrayList<T> getItems() {
		return this.items;
	}

}
