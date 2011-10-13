package com.RandomGods.models;

public class CardLibrary {
	private CardLibrary() {
	}
	
	public CardLibrary getInstance() {
		return LibraryInstance._instance;
	}
	
	private static class LibraryInstance {
		static final CardLibrary _instance = new CardLibrary();
	}
}
