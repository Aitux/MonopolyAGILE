package heritage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import monopoly.structure.Plateau;
import entite.Des;
import entite.Player;
import gui.FenetreJeu;
import gui.SelectionJoueurs;

public class Partie implements KeyListener {

	private Plateau board;
	private Player joueur;
	int i = 0;
	int doublon = 0;

	public Partie() {
		initialisationPartie();
		SelectionJoueurs select = new SelectionJoueurs();
		board.setJoueurs(select.getJoueurs());
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FenetreJeu(board);
			}
		});
	}

	public void tour() {

		System.out.println(board.toString());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Des d = joueur.move();
		int deplacement = d.getA() + d.getB();
		if (d.isDoublon()) {
			doublon++;
			if (doublon == 3) {
				joueur.prison = true;
			}
		} else {
			doublon = 0;
		}
		JOptionPane message = new JOptionPane();
		message.showMessageDialog(message, "Deplacement " + deplacement);
	}

	public void initialisationPartie() {
		board = new Plateau();
	}

	public Player getJoueur() {
		return joueur;
	}

	public void setJoueur(Player joueur) {
		this.joueur = joueur;
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			tour();
		}
	}

	public void keyReleased(KeyEvent e) {

	}

	public static void main(String[] args) {

		Partie partie = new Partie();

	}
}
