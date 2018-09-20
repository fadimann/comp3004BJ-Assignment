package core;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Deck;


public class DeckTest extends testCase{
	
	@Test
	public void createFullDeckTest()
	{
		Deck deck = new Deck();
		assertEquals(52, deck.createFullDeck());
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
	public void getCard()
	{
		Deck playerHand = new Deck();
		int deckSize = 52;

		assertNotSame(deckSize, deckSize - 1);
	}
	@Test
	public void addCard()
	{
		Deck playerHand = new Deck();
		playerHand.addCard(J);
		playerHand.addCard(J);
		playerHand.addCard(J);

		assertEquals(30, playerHand.getTotalHandValue());
	}
	
	@Test
	public void getCard()
	{
		Deck dealerHand = new Deck();
		int deckSize = 52;

		assertNotSame(deckSize, deckSize - 1);
	}
	@Test
	public void addCard()
	{
		Deck dealerHand = new Deck();
		dealerHand.addCard(J);
		dealerHand.addCard(J);
		dealerHand.addCard(J);

		assertEquals(30, dealerHand.getTotalHandValue());
	}


	
}
