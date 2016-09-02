package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entite.Des;
import entite.Player;
import monopoly.elements.Tour;

public class TestTour {

	@Test
	public void testTestDouble() {
		Tour t = new Tour(new Player("Alice"));
		Des d = new Des(2,2);
		t.setDoublon(2);
		t.testDouble(d);
		assertEquals(t.getDoublon(),0);
	}

	@Test
	public void testEventCash() {
		Player alice =new Player("Alice");
		Tour t = new Tour(alice);
		alice.setPosition(4);		
		assertEquals(t.testCashEvent(),200);
	}
}
