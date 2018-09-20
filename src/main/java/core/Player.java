package core;

public class Player {

	private String name;
	
	private Card[] hand = new Card[10];
	
	private int numCards;
	
	public Player(String aName){
		this.name =  aName;
		
		this.emptyHand();
	}
}
