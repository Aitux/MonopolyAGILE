package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Monopoly.Elements.Case;
import com.Monopoly.Elements.Neutre;

public class TestNeutre {

	@Test
	public void testLoyer() {
		Case n = new Neutre("Depart");
		assertEquals(n.Loyer(),0);
	}

}
