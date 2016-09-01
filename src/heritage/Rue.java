package heritage;

import entite.*;

import java.util.ArrayList;

public class Rue extends Propriete{
	private int maisons=0;
	
	public Rue(String nom, int prixAchat, ArrayList<Integer> prixtab) {
		super(nom, prixAchat, prixtab);
	}
	
	public int Loyer(){
		int terraintotal=0;
		int prixloyer=super.prixtab.get(1);
		for(Propriete terrain : super.itemadjointes){
			if(terrain.Proprietaire.getId()==this.Proprietaire.getId()){
				terraintotal++;
			}
		}	
		if(terraintotal==super.itemadjointes.size()){
			prixloyer=super.prixtab.get(2);
			if(maisons!=0){
				prixloyer=super.prixtab.get(2+maisons);
			}
		}
		return prixloyer;
	}
	
}
