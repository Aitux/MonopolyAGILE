package gui;

import heritage.Tour;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import monopoly.structure.Plateau;
import entite.Des;

public class FenetreJeu extends JPanel implements ActionListener {

	private final String LDes = "Lancer les dés !";
	private final String JSui = "Joueur Suivant";
	private JLabel image;
	private JLabel sous = new JLabel();
	private JLabel caseDuJoueur = new JLabel("truc muche");
	private JLabel aQuiLeTour = new JLabel();
	private JButton des = new JButton(LDes);
	private JLabel position = new JLabel();
	private JFrame frame = new JFrame("Monopoly");
	private JPanel info = new JPanel();
	private Plateau board;
	private Tour tour;

	public FenetreJeu() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		init();
		image = new JLabel(new ImageIcon(
				"/home/kwin/Monopoly/MonopolyAGILE/res/monopoly-plateau.jpg"));
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
		majInfo();
	}

	private void majInfo() {
		aQuiLeTour.setText("Joueur : " +tour.getJoueur().getName());
		position.setText("Case : " + tour.getJoueur().getPosition());
		sous.setText("Argent :"+tour.getJoueur().getArgent());
		caseDuJoueur.setText(board.cetteCase(tour.getJoueur().getPosition()));
	}

	public void actionPerformed(ActionEvent a) {
		if (a.getSource() == des && des.getText().equals(LDes)) {
			lanceDeDes();
		} else if (a.getSource() == des && des.getText().equals(JSui)) {
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
	}

	private void lanceDeDes() {
		Des lan = new Des();
		tour.testDouble(lan);
		if (tour.getJoueur().getPrison() > 0) {
			tour.getJoueur().setPosition(10);
			JOptionPane.showConfirmDialog(this, "Allez En Prison !");
		}
		tour.getJoueur().move(lan.getA() + lan.getB());
		majInfo();

		if (!lan.isDoublon()) {
			des.setText(JSui);
			info.repaint();
		}else 
			JOptionPane.showMessageDialog(this, "Rejouez vous venez de faire un double");
		majInfo();
	}
}