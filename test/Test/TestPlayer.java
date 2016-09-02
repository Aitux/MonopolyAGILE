package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Monopoly.Entite.Player;

public class TestPlayer {

	@Test
	public void testMove() {
		Player p= new Player();
		p.setPosition(10);
		p.move(6);
		assertTrue(p.getPosition()==16);
		p.setPosition(39);
		p.move(2);
		assertTrue(p.getPosition()==1);
	}
	
	@Test
	public void testNom(){
		Player p = new Player("Mathew", 1 , 1500);
		assertEquals("Player [name= Mathew, id= 1, argent= 1500]", p.toString());
		System.out.println(p.toString());
		
	}
	
	@Test
	public void testArgent(){
		Player m = new Player("Matthew");
		m.pickOffArgent(200);
		assertTrue(m.getArgent() == 1300);
	}
}