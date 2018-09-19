package core;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Blackjack;


public class BlackjackTest {
	

	@Test
	public void playerCardsTest()
	{
		Blackjack playerCards = new Blackjack();
		playerCards.toString(SEVEN);
		assertEquals(1 , playerCards.toString());
	}
	
	@Test
	public void toStringTest()
	{
		Blackjack playerCards = new Blackjack();
		playerCards.addCard(SEVEN);
		playerCards.addCard(A);
		playerCards.addCard(J);

		assertEquals("SEVEN A J", playerCards.toString());
	}
	

	@Test
	public void topCardOnlyTest()
	{
		Blackjack dealerCards = new Blackjack();
		dealerCards.addCard(SEVEN);
		dealerCards.addCard(A);
		dealerCards.addCard(J);

		assertEquals("7 X X", dealerCards.topCardOnlyTest());
	}
	
	
	
}
