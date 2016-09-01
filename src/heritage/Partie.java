package heritage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import entite.Player;
import monopoly.structure.Plateau;

public class Partie implements KeyListener{
	
	private Plateau board;
	private Player joueur;
	int i=0;

	public Partie(){
		initialisationPartie();
		joueur=new Player("Paul",1);
		board.addJoueur(joueur);
		while(i<10){
			i++;
			tour();
		}
	}
	
	public void tour(){
		
		System.out.println(board.toString());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int deplacement = joueur.move();
		JOptionPane message = new JOptionPane();
		message.showMessageDialog(message, "Deplacement "+deplacement);
	}
	
	public void initialisationPartie(){
		board = new Plateau();
	}

	public Player getJoueur() {
		return joueur;
	}

	public void setJoueur(Player joueur) {
		this.joueur = joueur;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == com.sun.glass.events.KeyEvent.VK_ENTER){
			tour();
		}	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args){
		
		Partie partie = new Partie();
	
	}
}
