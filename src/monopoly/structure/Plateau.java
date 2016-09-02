package monopoly.structure;

import java.io.IOException;
import java.util.ArrayList;

import entite.Player;
import monopoly.elements.Case;
import monopoly.elements.Neutre;
import monopoly.elements.Rue;

public class Plateau {

	private Case plateau[];
	private ArrayList<Player> joueurs = new ArrayList<Player>();

	public Plateau() {
		plateau = new Case[40];
		try {
			initialisation(Lecturecsv.lectureCSV());
		} catch (IOException e) {
		}
	}

	public Plateau(Case[] plateau, ArrayList<Player> joueurs) {
		this();
		this.plateau = plateau;
		this.joueurs = joueurs;
	}

	private void initialisation(ArrayList<String[]> dataCases) {
		for (int i = 0; i < dataCases.size(); i++) {
			if (i == 40)
				break;
			String[] s = dataCases.get(i);
			if (s[1].equals("Idle")) {
				plateau[i] = new Neutre(s[0]);
			}
			if (s[1].equals("Street")) {
				ArrayList<Integer> prixTab = new ArrayList<Integer>();
				for (int num = 6; i < 12; i++) {
					prixTab.add(Integer.parseInt(s[i]));
				}
				plateau[i] = new Rue(s[0], Integer.parseInt(s[4]), prixTab,
						s[2]);
			}
		}
	}

	public String cetteCase(int num) {
		String rez = "";
		// TODO Affichage infos de la case
		return rez;
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
