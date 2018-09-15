package core;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cards;
	
	//Creates new deck of playing cards
	public Deck(){
		this.cards = new ArrayList<Card>();
	}
	
	
	//Add 52 playing cards to a deck
	public void DeckCreator(){
		//Generate Cards
		//Loop Through Suits
		for(Suit cardSuit : Suit.values()){
			//Loop through Values
			for(Value cardValue : Value.values()){
				//Add new card to the mix
				this.cards.add(new Card(cardSuit,cardValue));
			}
		}
	}
			
	public void shuffle(){
		//Create a new arraylist to hold the shuffled cards temporarily
		ArrayList<Card> tmpDeck = new ArrayList<Card>();
		//Randomly pick from the old deck and copy values to the new deck
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.cards.size();
		for(int i = 0; i<originalSize;i++){
			//gen random num according to int randomNum = rand.nextInt((max - min) + 1) + min;
			randomCardIndex = random.nextInt((this.cards.size()-1 - 0) + 1) + 0;
			//throw random card into new deck
			tmpDeck.add(this.cards.get(randomCardIndex));
			//remove picked from old deck
			this.cards.remove(randomCardIndex);
		}
		//set this.deck to our newly shuffled deck
		this.cards = tmpDeck;
	}	
			
		
}
