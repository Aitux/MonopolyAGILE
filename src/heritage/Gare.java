package heritage;


import java.util.ArrayList;

public class Gare extends Propriete{
	private String nom;
	private int prixAchat;
	private int loyeractuel;
	private ArrayList<Propriete> gareadjointes;
	
	public Gare(){
		this.nom=super.nom;
		this.prixAchat=super.prixAchat;
		this.loyeractuel=super.loyeractuel;
	}
	

}
