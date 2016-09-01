package gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FenetreJeu extends JFrame{
	
	BufferedImage buffer;
	Image image;
	
	public FenetreJeu(){
		
		/*try {
			buffer = ImageIO.read(this.getClass().getResource("monopoly-classique-plateau.jpg"));
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}*/
		image = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("monopoly-classique-plateau.jpg"));
		
		Component imageComp = new JComponent() {
			@Override
			public void paint(Graphics arg0) {
				super.paint(arg0);
				arg0.drawImage(image, 0, 0, this);
			}
		};
		
		add(imageComp);
		
		setSize(new Dimension(1241, 1241));
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
