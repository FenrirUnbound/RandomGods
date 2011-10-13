package com.RandomGods.models;

public class Card {
	private String _name;
	private int _cost;
	
	public Card(String cardName, int cardCost) {
		_name = new String(cardName);
		_cost = cardCost;
	}
	
	public int getCost() {
		return _cost;
	}
	
	public String getName() {
		return _name;
	}
}
