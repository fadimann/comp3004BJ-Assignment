package core;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Deck;


public class DeckTest{
	
	@Test
	public void DeckTest()
	{
		Deck deck = new Deck();
		assertEquals(52, deck.myCards());
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
