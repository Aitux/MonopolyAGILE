package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Monopoly.Entite.Player;
import com.Monopoly.Structure.Plateau;

public class TestPlateau {
	
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
	
	@Test
	public void testNewPlateau() {
		Plateau board = new Plateau();
		board.addJoueur(new Player("Alice"));

		assertTrue(board.getPlateau().length == 40);
		assertTrue(board.getJoueurs().size() == 1);
	}

	@Test
	public void testThisCase() {
		Plateau board = new Plateau();
		assertEquals(board.cetteCase(18),"\"Boulevard saint-Michel\"");
		assertEquals(board.cetteCase(0),"\"Depart\"");
	}
}
