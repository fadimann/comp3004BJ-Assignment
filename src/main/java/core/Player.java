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

	public boolean addCard(Card aCard){
		if(this.numCards == 10){
			System.err.printf("%s's hand already has 10 cards;" +
		"Cannot add another\n", this.name);
			System.exit(1);
		}
		this.hand[this.numCards] = aCard;
		this.numCards++;
		
		return (this.getHandSum() <= 21);
	}
	
	
	
}
