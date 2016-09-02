package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import entite.Des;
import entite.Player;

public class TestPlayer {

	@Test
	public void testMove() {
		Player p= new Player();
		p.position=10;
		p.move(6);
		assertTrue(p.position==16);
		p.position=39;
		p.move(2);
		assertTrue(p.position==1);
	}
	
	@Test
	public void testNom(){
		Player p = new Player("Mathew", 1 , 1500);
		assertEquals("Player [name= Mathew, id= 1, argent= 1500]", p.toString());
		System.out.println(p.toString());
		
	}
}