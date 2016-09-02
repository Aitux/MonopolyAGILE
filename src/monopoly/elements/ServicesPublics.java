package monopoly.elements;

import java.util.ArrayList;

public class ServicesPublics extends Propriete{
	
	public ServicesPublics(String nom, int prixAchat, ArrayList<Integer> prixtab) {
		super(nom, prixAchat, prixtab);
	}
	
	public int Loyer(){
		return loyeractuel;
		
	}
	
}
