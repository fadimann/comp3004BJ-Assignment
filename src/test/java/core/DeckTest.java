package core;

import static org.junit.Assert.*;
import org.junit.Test;


public class DeckTest {
	
	@Test
	public void createFullDeckTest()
	{
		Deck deck = new Deck();
		assertEquals(52, deck.createFullDeck());
	}
	
}
