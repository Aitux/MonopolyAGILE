package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import entite.Des;
import entite.Player;

public class TestPlayer {

	@Test
	public void testMove() {
		Player p= new Player();
		Des d = new Des();
		d = p.move();
		int deplacement = d.getA() + d.getB();
		assertTrue(deplacement<13 && deplacement>1);
	}
	
	@Test
	public void testNom(){
		Player p = new Player("Mathew", 1 , 1500);
		assertEquals("Player [name= Mathew, id= 1, argent= 1500]", p.toString());
		System.out.println(p.toString());
		
	}
}