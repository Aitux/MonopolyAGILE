package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FenetreJeu extends JFrame{
	public FenetreJeu(){
		
		
		
		setSize(new Dimension(500, 500));
		setMinimumSize(getSize());
		setTitle("Monopoly");
		
		//Calculate the centre screen localisation
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setLocation((int) ((width/2 - this.getWidth()/2)), (int) (height/2 - this.getHeight()/2));
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FenetreJeu();
	}
}
