package core;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
    private Card[] myCards;
    private int numCards;
    
    public Deck(int numDecks, boolean shuffle){
    	this.numCards = 52;
    	this.myCards = new Card[this.numCards];
    }
	

}
		
