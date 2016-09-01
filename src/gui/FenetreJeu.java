package gui;

import heritage.Partie;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import monopoly.structure.Plateau;

public class FenetreJeu extends JPanel {

	private JLabel image;
	private int idJoueur = 0;
	private JLabel aQuiLeTour = new JLabel();
	private JButton des = new JButton("Lancer les dés !");
	private JFrame frame = new JFrame("Monopoly");
	private JPanel info = new JPanel();
	private Plateau board;
	private Partie partie;

	public FenetreJeu(Plateau board) {
		this.board = board;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

	private void initInfo() {
		this.add(info, BorderLayout.EAST);
		info.setPreferredSize(new Dimension(150, this.HEIGHT));
		info.add(aQuiLeTour);
		info.add(des);
	}

	private void init() {
		aQuiLeTour.setText(board.getJoueurs().get(0).getName());
	}

}