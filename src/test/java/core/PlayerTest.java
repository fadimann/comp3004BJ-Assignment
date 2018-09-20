package core;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Deck;


public class PlayerTest {

	@Test
	public void emptyHandTest()
	{
		Player hand = new Player();
		assertNull(hand);
	}
	
	@Test
	public void addCardTest()
	{
		Player aCard = new Player();
		assertTrue(aCard);
	}
	
	@Test
	public void getHandSumTest()
	{
		Player getHand = new Player();
		assertTrue(getHand);
		assertEqual(21, getHand());
	}
	
}
