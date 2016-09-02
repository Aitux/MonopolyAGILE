package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Monopoly.Entite.Des;

public class TestDes {
	Des d;
	
	@Test
	public void TestDesRandom(){
		d = new Des();
		assertTrue(d.getA()>0 && d.getA()<7 && d.getB()>0 && d.getB()<7);
	}
	
	@Test
	public void TestDoublon(){
		d = new Des(1,1);
		assertTrue(d.isDoublon());
	}
}
