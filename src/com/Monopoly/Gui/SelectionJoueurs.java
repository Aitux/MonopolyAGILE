package com.Monopoly.Gui;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.Monopoly.Entite.Player;

public class SelectionJoueurs {

	private ArrayList<Player> joueurs = new ArrayList<Player>();

	public SelectionJoueurs() {
		String nb = "";
		do {
			nb = JOptionPane.showInputDialog("Nombre de joueurs :");
		} while (!nb.matches("[0-9]") || Integer.parseInt(nb) > 6 || Integer.parseInt(nb)==0);

		for (int i = 0; i < Integer.parseInt(nb); i++) {
			joueurs.add(new Player(JOptionPane.showInputDialog("Nom du Joueur N°"+ (int)(i+1))));
		}
	}
	
	public String toString() {
		String str ="";
		for(Player p : joueurs)
			str +=p.getName()+"\n";
		return str;
	}

	public ArrayList<Player> getJoueurs() {
		return joueurs;
	}
}
