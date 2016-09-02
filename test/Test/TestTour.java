package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.Monopoly.Elements.Tour;
import com.Monopoly.Entite.Des;
import com.Monopoly.Entite.Player;

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
