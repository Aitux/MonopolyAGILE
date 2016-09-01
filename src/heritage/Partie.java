package heritage;

import entite.Player;

public class Partie {
	
	private Case[] partie;
	private Player joueur;

	public Partie(Player joueur){
		this.joueur=joueur;
	}
	
	public void tour(){
		
	}
	
	public void initialisationPartie(){
		partie = new Case[40];
	}

	public Player getJoueur() {
		return joueur;
	}

	public void setJoueur(Player joueur) {
		this.joueur = joueur;
	}
}
