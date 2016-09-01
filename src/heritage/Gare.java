package heritage;



import java.util.ArrayList;

public class Gare extends Propriete{
	private String nom;
	private int prixAchat;
	private int loyeractuel;
	private ArrayList<Propriete> gareadjointes;
	
	public Gare(String nom, int prixAchat, int loyerActuel) {
		this.nom=nom;
		this.prixAchat=loyerActuel;
		this.loyeractuel=loyerActuel;
	}
	

}
