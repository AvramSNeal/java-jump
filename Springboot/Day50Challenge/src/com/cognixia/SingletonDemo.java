package com.cognixia;

import java.util.Arrays;

public class SingletonDemo {

	public static void main(String[] args) {
		Player p1 = new Player();
		
		p1.getCards();
		p1.showDeck();

	}

}

class Deck{
	private static Deck deck_instance = null;
	
	public String d;
	
	private Deck() {
		d = "String in Deck(Singleton) class";
	}
	
	public static Deck getInstance() {
		if(deck_instance == null) {
			deck_instance = new Deck();
		}
		
		return deck_instance;
	}
	
	private int deck[] = new int[] {2,3,4,5,6,7,8,9,10};
	
	public void shuffle() {
		for(int i=0;i<deck.length;i++) {
			int rando = i + (int)(Math.random()*(deck.length-i));
			int temp = deck[rando];
			deck[rando]=deck[i];
			deck[i]=temp;
		}
	}
	
	public int[] getDeck() {
		return deck;
	}
	
	
	public int deal() {
		shuffle();
		int card=deck[(int)Math.random()*(deck.length)];
		return card;
	}
}

class Player{
	Deck deck1 = Deck.getInstance();
	Deck deck2 = Deck.getInstance();
	
	public void getCards() {
		
		
		System.out.println("Card dealt from deck 1: " + deck1.deal());
		System.out.println("Card dealt from deck 2: " + deck2.deal());
	}
	
	public void showDeck() {
		System.out.println("Deck 1: " + Arrays.toString(deck1.getDeck()));
		System.out.println("Deck 2: " + Arrays.toString(deck2.getDeck()));
	}
	
	
	
	
}