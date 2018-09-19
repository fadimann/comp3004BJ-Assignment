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
		
		//Calculate the value of deck
		public int cardsValue(){
			int totalValue = 0;
			int aces = 0;
			//For every card in the deck
			for(Card aCard : this.cards){
				//Switch of possible values
				switch(aCard.getValue()){
				case TWO: totalValue += 2; break;
				case THREE: totalValue += 3; break;
				case FOUR: totalValue += 4; break;
				case FIVE: totalValue += 5; break;
				case SIX: totalValue += 6; break;
				case SEVEN: totalValue += 7; break;
				case EIGHT: totalValue += 8; break;
				case NINE: totalValue += 9; break;
				case TEN: totalValue += 10; break;
				case J: totalValue += 10; break;
				case Q: totalValue += 10; break;
				case K: totalValue += 10; break;
				case A: aces += 1; break;
				}			
			}
			
			//Determine the total current value with aces
			//Aces worth 11 or 1 - if 11 would go over 21 make it worth 1
			for(int i = 0; i < aces; i++){
				//If they're already at over 10 getting an ace valued at 11 would put them up to 22, so make ace worth one
				if (totalValue > 10){
					totalValue += 1;
				}
				else{
					totalValue += 11;
				}
			}
			//Return
			return totalValue;
		}
	

}
		
