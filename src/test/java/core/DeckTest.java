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
	
	@Test
	public void getCardTest()
	{
		Deck playerHand = new Deck();
		int deckSize = 52;

		assertNotSame(deckSize, deckSize - 1);
	}
	@Test
	public void addCardTest()
	{
		Deck playerHand = new Deck();
		playerHand.addCard(J);
		playerHand.addCard(J);
		playerHand.addCard(J);

		assertEquals(30, playerHand.getTotalHandValue());
	}
	
	@Test
	public void getCardTest()
	{
		Deck dealerHand = new Deck();
		int deckSize = 52;

		assertNotSame(deckSize, deckSize - 1);
	}
	@Test
	public void addCardTest()
	{
		Deck dealerHand = new Deck();
		dealerHand.addCard(J);
		dealerHand.addCard(J);
		dealerHand.addCard(J);

		assertEquals(30, dealerHand.getTotalHandValue());
	}
	
	@Test
	public void shuffleTest()
	{
		Deck numCards = new Deck();

		assertEquals(52, myCards.numCards());
	}
	
	@Test
	public void dealNextCardTest()
	{
		Deck removecard = new Deck();
	
		assertNotSame(removecard, numCards);
	}
	
	
}
