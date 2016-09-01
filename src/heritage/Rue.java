package heritage;

import entite.*;

import java.util.ArrayList;

public class Rue extends Propriete{
	private Player Proprietaire=null;
	private String nom;
	private int prixAchat;
	private int maisons=0;
	private int loyeractuel;
	private ArrayList<Propriete> rueadjointes;
	private int prixtab[];
	
	public Rue(String nom, int prixAchat, int loyerActuel) {
		this.nom=nom;
		this.prixAchat=loyerActuel;
		this.loyeractuel=loyerActuel;
	}
	
	public void Loyer(){
		int terraintotal=0;
		for(Propriete terrain : rueadjointes){
			if(terrain.Proprietaire.getId()==this.Proprietaire.getId()){
				terraintotal++;
			}
		}	
		if(terraintotal==rueadjointes.size()){
			//set le loyeractuel
			if(maisons!=0){
				loyeractuel=prixtab[maisons];
			}
		}
		
	}
	
}
