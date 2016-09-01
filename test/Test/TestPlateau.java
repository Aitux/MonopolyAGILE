package Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import entite.Player;
import monopoly.structure.Plateau;

public class TestPlateau {
	
	@Test
	public void testGetPlateau() {
		Plateau plat = new Plateau();
		assertTrue(plat.getPlateau()==null);
	}
	
	@Test
	public void testAddJoueur() {
		Plateau plat = new Plateau();
		assertTrue(plat.addJoueur(new Player("Test", 1)));
	}

	@Test
	public void testRmJoueur() {
		Plateau plat = new Plateau();
		Player test = new Player("test", 1);
		plat.addJoueur(test);
		assertTrue(plat.rmJoueur(test));
	}
}
