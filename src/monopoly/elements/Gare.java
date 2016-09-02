package monopoly.elements;



import java.util.ArrayList;

public class Gare extends Propriete{
	
	public Gare(String nom, int prixAchat, ArrayList<Integer> prixtab) {
		super(nom, prixAchat, prixtab);
	}
	
	public int Loyer(){
		int terraintotal=0;
		for(Propriete terrain : super.itemadjointes){
			if(terrain.Proprietaire.getId()==this.Proprietaire.getId()){
				terraintotal++;
			}
		}
		return super.prixtab.get(1+terraintotal);
		
	}
	

}
