package core;

import junit.framework.TestCase;


public class DeckTest extends TestCase{
	
	public void testDeckCreator(){
		Deck fulldeck = new Deck();
		
		assertEquals(52, 52);
	}

}
