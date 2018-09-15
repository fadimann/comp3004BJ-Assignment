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
			
		
			
		
}
