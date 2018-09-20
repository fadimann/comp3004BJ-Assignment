package core;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Deck;


public class DeckTest{
	
	@Test
	public void createFullDeckTest()
	{
		Deck deck = new Deck();
		assertEquals(52, deck.myCards());
	}
	@Test
	public void shuffleTest()
	{
		Deck deck = new Deck();
		Deck shuffle = new Deck();
		assertNotEquals(shuffle(1), deck(1));
	}
	
	@Test
	public void removeCardTest()
	{
		Deck deck = new Deck();
		assertEquals(51, deck-1);
		
	}
	
	@Test
	public void getCardTest()
	{
		Deck deck = new Deck();
		assertEquals(51, deck-1);
	}
	
	

	@Test
	public void addCardTest()
	{
		Deck playerCards = new Deck();
		assertEquals(2, assertEquals(2, playerCards.addCard());
	}
	
	@Test
	public void toStringTest()
	{
		Deck Ten = new Deck();
		assertEquals(10, Ten.toString());
	}
	
	
	
	@Test
	public void cardsValueTest()
	{
		Deck J = new Deck();
		assertEquals(10, J.cardsValue());
		
		Deck Q = new Deck();
		assertEquals(10, Q.cardsValue());
		
		Deck K = new Deck();
		assertEquals(10, K.cardsValue());
	}
	
	
}
