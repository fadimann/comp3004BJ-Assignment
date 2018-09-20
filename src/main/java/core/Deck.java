package core;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
    private Card[] myCards;
    private int numCards;
    
    public Deck(){
    	this(1, false);
    }
    
    public Deck(int numDecks, boolean shuffle){
    	this.numCards = 52;
    	this.myCards = new Card[this.numCards];
    
	
    int c = 0;
    for(int d = 0; d < 52; d++){
    	for(int s = 0; s < 4; s++){
    		for(int n = 1; n<= 13; n++){
    			this.myCards[c] = new Card(Suit.values()[s], n);
    			c++;
    		}
    	}
    }
    
    if (shuffle){
    	this.shuffle();
    }
    
    }


    public void shuffle(){
    	Random rng = new Random();
    	
    	Card temp;
    	
    	int j;
    	for(int i = 0; i < this.numCards; i++){
    		j = rng.nextInt(this.numCards);
    		
    		temp = this.myCards[i];
    		this.myCards[i] = this.myCards[j];
    		this.myCards[j] = temp;
    	}
    }

    
}
 

    	
    


		
