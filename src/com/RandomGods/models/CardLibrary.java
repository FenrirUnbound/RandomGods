package com.RandomGods.models;

public class CardLibrary {
	private static CardLibrary _instance = null;

	private CardLibrary() {
		
	}
	
	public CardLibrary getInstance() {
		if(_instance != null)
			return _instance;
		else
			return _instance = new CardLibrary();
	}
}
