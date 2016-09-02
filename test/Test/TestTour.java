package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import entite.Des;
import entite.Player;
import heritage.Tour;

public class TestTour {

	@Test
	public void testTestDouble() {
		Tour t = new Tour(new Player("Alice"));
		Des d = new Des(2,2);
		t.setDoublon(2);
		t.testDouble(d);
		assertEquals(t.getDoublon(),0);
	}

}
