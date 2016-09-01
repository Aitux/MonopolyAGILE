package heritage;



import java.util.ArrayList;

public class Gare extends Propriete{
	private String nom;
	private int prixAchat;
	private int loyeractuel;
	private ArrayList<Propriete> gareadjointes;
	private int prixtab[];
	
	public Gare(String nom, int prixAchat, int loyerActuel) {
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
		loyeractuel=prixtab[terraintotal];
		
	}
	

}
