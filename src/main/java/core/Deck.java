package core;

import java.util.ArrayList;
import java.util.Random;

import core.Card;
import core.Suit;
import core.Value;

public class Deck {
	
    private ArrayList<Card> cards;
	
	public Deck(){
		//Create a new deck of playing cards
		this.cards = new ArrayList<Card>();
	}
	
	//Add 52 playing cards to a deck
		public void createFullDeck(){
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
		
}
		
