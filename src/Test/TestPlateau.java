package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import entite.Player;
import monopoly.structure.Plateau;

public class TestPlateau {

	@Test
	public void testAddJoueur() {
		Plateau plat = new Plateau();
		assertTrue(plat.addJoueur(new Player("Test", 1)));
	}

	@Test
	public void testrmJoueur() {
		Plateau plat = new Plateau();
		Player test = new Player("test", 1);
		plat.addJoueur(test);
		assertTrue(plat.rmJoueur(test));
	}
}
