package monopoly.elements;

import javax.swing.SwingUtilities;

import entite.Des;
import entite.Player;
import gui.FenetreJeu;

public class Tour {

	private Player joueur;
	int i = 0;
	int doublon = 0;

	public Tour(Player p) {
		this.joueur = p;
	}

	public void testDouble(Des d) {
		if (d.isDoublon()) {
			doublon++;
			if (doublon == 3) {
				joueur.prison = 3;
				doublon = 0;
			}
		} else {
			doublon = 0;
		}
	}
	
	public int getDoublon() {
		return doublon;
	}

	public void setDoublon(int doublon) {
		this.doublon = doublon;
	}

	public Player getJoueur() {
		return joueur;
	}

	public void setJoueur(Player joueur) {
		this.joueur = joueur;
	}
}
