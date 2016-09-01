package heritage;

import java.util.ArrayList;

import entite.Player;
import enumeration.TypeCase;

public abstract class Case {

	ArrayList<Player> JoueurSurCase;
	String nom; // nom de la case
	TypeCase Type;
	
	public Case(String nom){
		this.nom=nom;
	}
	
	
	public abstract int Loyer();


	public ArrayList<Player> getJoueurSurCase() {
		return JoueurSurCase;
	}


	public void setJoueurSurCase(ArrayList<Player> joueurSurCase) {
		JoueurSurCase = joueurSurCase;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public TypeCase getType() {
		return Type;
	}


	public void setType(TypeCase type) {
		Type = type;
	}
	
	
}
