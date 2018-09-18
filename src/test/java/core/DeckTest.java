package core;

import junit.framework.TestCase;


public class DeckTest extends TestCase{
	
	public void testDeckCreator(){
		Deck solver = new Deck();
		
		assertEquals(52, solver.DeckCreator(52));
	}
	
	public void testShuffle(){
		Deck solver = new Deck();
		
		assertEquals(52, solver.shuffle(52));
	}
	
	

}
