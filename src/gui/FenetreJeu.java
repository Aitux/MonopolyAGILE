package gui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FenetreJeu extends JPanel {

	private JLabel image;
	private JFrame frame = new JFrame("Monopoly");
	
	public FenetreJeu() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		image = new JLabel(new ImageIcon("/home/kwin/Monopoly/MonopolyAGILE/res/monopoly-classique-plateau.jpg"));
		this.add(image);
		this.setLayout(new BorderLayout());
		this.add(image, BorderLayout.CENTER);
		frame.add(this);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FenetreJeu();
			}
		});
	}
}