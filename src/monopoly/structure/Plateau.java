package monopoly.structure;
import java.util.ArrayList;

import entite.Player;
import heritage.Case;

public class Plateau {
	
	private Case plateau[];
	private ArrayList<Player> joueurs;
	
	public Plateau() {
		super();
		joueurs = new ArrayList<Player>();
	}

	public Plateau(Case[] plateau, ArrayList<Player> joueurs) {
		super();
		this.plateau = plateau;
		this.joueurs = joueurs;
	}
	
	public boolean addJoueur(Player p) {
		return joueurs.add(p);
	}
	
	public boolean rmJoueur(Player p) {
		return joueurs.remove(p);
	}

	public ArrayList<Player> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(ArrayList<Player> joueurs) {
		this.joueurs = joueurs;
	}

	public Case[] getPlateau() {
		return plateau;
	}
}
