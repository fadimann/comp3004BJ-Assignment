package core;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Deck;


public class CardTest {
	
	@Test
	public void toStringTest()
	{
		Card playerCards = new Card();

		assertEquals("2", playerCards.toString(Two));
	}
	
	@Test
	public void Card()
	{
		Card aNumber = new Card();

		assertEquals("aNumber", aNumber.Card(11));
	}
	@Test
	public void Card()
	{
		Card aNumber = new Card();

		assertEquals("aNumber", aNumber.Card(10));
	}
	@Test
	public void Card()
	{
		Card aNumber = new Card();

		assertEquals("aNumber", aNumber.Card(5));
	}
	@Test
	public void Card()
	{
		Card aNumber = new Card();

		assertEquals("aNumber", aNumber.Card(3));
	}
	@Test
	public void Card()
	{
		Card aNumber = new Card();

		assertEquals("aNumber", aNumber.Card(7));
	}
	
}
