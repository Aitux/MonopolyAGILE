package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import entite.Player;

public class TestPlayer {

	@Test
	public void testMove() {
		Player p= new Player();
		assertTrue(p.move()<13 && p.move()>1);
	}
}