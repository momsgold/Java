import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void testCreatePirate() {
		Pirate p = new Pirate("Larry");
		assertEquals("Larry", p.getName());
		assertEquals(4, p.getLimbsRemaining());
	}
	
	@Test
	public void testCreateOctoPirate() {
		Pirate p = new Pirate ("OctoPaul", 8); // Paul has 8 limbs
		assertEquals(8, p.getLimbsRemaining());
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullPirate() {
		Pirate p = null;
		p.loseALimb();
	}
	
	@Test
	public void testIsDead() {
		Pirate p = new Pirate("The Dread Pirate Roberts");
		p.loseALimb();
		assertFalse(p.isDead()); // assert that isDead method will return false
		p.loseALimb();
		assertFalse(p.isDead());
		p.loseALimb();
		assertFalse(p.isDead());
		p.loseALimb();
		assertFalse(p.isDead());
		// he dead... 4 limbs lost
		p.loseALimb(); 
		assertTrue(p.isDead());
	}

}
