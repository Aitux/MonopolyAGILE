package entite;

import java.util.Random;

public class Des {
	private int a=1;
	private int b=1;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Des(){
		Random r = new Random();
		a = r.nextInt(6)+1;
		b = r.nextInt(6)+1;
	}
	
	
}
