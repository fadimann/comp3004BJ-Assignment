package core;

public class Player {

	private String name;
	
	private Card[] hand = new Card[10];
	
	private int numCards;
	
	public Player(String aName){
		this.name =  aName;
		
		this.emptyHand();
	}
	
	public void emptyHand(){
		for(int c = 0; c<10; c++){
			this.hand[c] = null;
		}
		this.numCards = 0;
	}

	
}
