package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import monopoly.elements.Case;
import monopoly.elements.Neutre;

public class TestNeutre {

	@Test
	public void testLoyer() {
		Case n = new Neutre("Depart");
		assertEquals(n.Loyer(),0);
	}

}
