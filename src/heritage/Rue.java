package heritage;

import entite.*;

import java.util.ArrayList;

public class Rue extends Propriete{
	private Player Proprietaire=null;
	private String nom;
	private int prixAchat;
	private int loyeractuel;
	private ArrayList<Propriete> rueadjointes;
	
	public Rue(String nom, int prixAchat, int loyerActuel) {
		this.nom=nom;
		this.prixAchat=loyerActuel;
		this.loyeractuel=loyerActuel;
	}
	
	public void Loyer(){
		for(Propriete terrain : rueadjointes){
			
		}	
		
	}
	
}
