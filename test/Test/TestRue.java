package Test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import monopoly.elements.Propriete;
import monopoly.elements.Rue;

public class TestRue {

	@Test
	public void prixLoyer() {
		Rue r = new Rue("Avenue de la Republique", 100, Propriete.prixtab, Color.blue);
		
	}

}
