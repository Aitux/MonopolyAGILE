package com.Monopoly.Gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.Monopoly.Elements.Neutre;
import com.Monopoly.Elements.Propriete;
import com.Monopoly.Elements.Rue;
import com.Monopoly.Elements.Tour;
import com.Monopoly.Entite.Des;
import com.Monopoly.Structure.Plateau;

public class FenetreJeu extends JPanel implements ActionListener {

	private final String LDes = "Lancer les dés !";
	private final String JSui = "Joueur Suivant";
	private JLabel image;
	private JLabel sous = new JLabel();
	private JLabel caseDuJoueur = new JLabel("truc muche");
	private JLabel caseDuJoueurPrix = new JLabel("truc muche");
	private JLabel aQuiLeTour = new JLabel();
	private JButton des = new JButton(LDes);
	private JButton achat = new JButton("Acheter !");
	private JLabel position = new JLabel();
	private JFrame frame = new JFrame("Monopoly");
	private JPanel info = new JPanel();
	private Plateau board;
	private Tour tour;

	public FenetreJeu() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		init();
		image = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(
				this.getClass().getResource("/monopoly-plateau.jpg"))));
		this.setLayout(new BorderLayout());
		this.add(image, BorderLayout.CENTER);
		initInfo();
		frame.add(this);
		frame.setVisible(true);
		frame.pack();
	}

	private void init() {
		board = new Plateau();
		SelectionJoueurs select = new SelectionJoueurs();
		board.setJoueurs(select.getJoueurs());
		this.tour = new Tour(board.getJoueurs().get(0));

		des.addActionListener(this);
		achat.addActionListener(this);
	}

	private void initInfo() {
		this.add(info, BorderLayout.EAST);
		info.setPreferredSize(new Dimension(150, this.HEIGHT));
		info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
		info.add(aQuiLeTour);
		info.add(sous);
		info.add(des);
		info.add(position);
		info.add(caseDuJoueur);
		info.add(caseDuJoueurPrix);
		majInfo();
	}

	private void majInfo() {
		aQuiLeTour.setText("Joueur : " + tour.getJoueur().getName());
		position.setText("Case : " + tour.getJoueur().getPosition());
		sous.setText("Argent :" + tour.getJoueur().getArgent());

		if (board.getPlateau()[tour.getJoueur().getPosition()] != null)
			caseDuJoueur.setText(board.getPlateau()[tour.getJoueur()
					.getPosition()].getNom());
		else
			caseDuJoueur.setText("");

		if (board.getPlateau()[tour.getJoueur().getPosition()] != null)
			caseDuJoueurPrix.setText(""
					+ board.getPlateau()[tour.getJoueur().getPosition()]
							.getPrixAchat());
		else
			caseDuJoueurPrix.setText("");
		if (!(board.getPlateau()[tour.getJoueur().getPosition()] instanceof Neutre)) {
			info.add(achat);
		}

		if (!(board.getPlateau()[tour.getJoueur().getPosition()] instanceof Rue))
			info.remove(achat);

		info.repaint();
		repaint();
	}

	public void actionPerformed(ActionEvent a) {
		if (a.getSource() == des && des.getText().equals(LDes)) {
			info.remove(achat);
			info.repaint();
			lanceDeDes();
			majInfo();
		} else if (a.getSource() == des && des.getText().equals(JSui)) {
			info.remove(achat);
			info.repaint();
			for (int i = 0; i < board.getJoueurs().size(); i++) {
				if (board.getJoueurs().get(i).equals(tour.getJoueur())) {
					tour = new Tour(board.getJoueurs().get(
							(i + 1) % board.getJoueurs().size()));
					break;
				}
			}
			des.setText(LDes);
			majInfo();
		}
		if (a.getSource() == achat) {
			acheter();
		}
	}

	private void acheter() {
		info.remove(achat);

		int caseP = tour.getJoueur().getPosition();
		if (board.getPlateau()[caseP] instanceof Propriete) {
			int prixCase = ((Propriete) (board.getPlateau()[caseP]))
					.getPrixAchat();

			if (tour.getJoueur().getArgent() - prixCase > 0) {
				tour.getJoueur().addCase(
						(Propriete) (board.getPlateau()[caseP]));
				tour.getJoueur().setArgent(
						tour.getJoueur().getArgent() - prixCase);
			}
		}
		majInfo();
	}

	private void lanceDeDes() {
		majInfo();
		Des lan = new Des();
		tour.testDouble(lan);
		if (tour.getJoueur().getPrison() > 0) {
			tour.getJoueur().setPosition(10);
			JOptionPane.showConfirmDialog(this, "Allez En Prison !");
		}
		tour.getJoueur().move(lan.getA() + lan.getB());
		majInfo();

		int taxe = tour.testCashEvent();
		if(taxe!=0)JOptionPane.showMessageDialog(this,
				"Vous devez payer la taxe de "+taxe);
		if (!lan.isDoublon()) {
			des.setText(JSui);
			info.repaint();
		} else
			JOptionPane.showMessageDialog(this,
					"Rejouez vous venez de faire un double");
		majInfo();
	}
}