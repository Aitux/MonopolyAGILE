package heritage;



import java.util.ArrayList;

public class ServicesPublics {
	private String nom;
	private int prixAchat;
	private int loyeractuel;
	private ArrayList<Propriete> SPadjointes;
	
	public ServicesPublics(String nom, int prixAchat, int loyerActuel) {
		this.nom=nom;
		this.prixAchat=loyerActuel;
		this.loyeractuel=loyerActuel;
	}
}
