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

}
