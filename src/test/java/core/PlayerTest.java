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
	
}
