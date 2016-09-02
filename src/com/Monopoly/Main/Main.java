package com.Monopoly.Main;
import javax.swing.SwingUtilities;

import com.Monopoly.Gui.FenetreJeu;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FenetreJeu();
			}
		});
	}
}
