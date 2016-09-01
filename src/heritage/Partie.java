<<<<<<< HEAD
package heritage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import entite.Player;

public class Partie implements KeyListener{
	
	private Case[] partie;
	private Player joueur;

	public Partie(Player joueur){
		this.joueur=joueur;
	}
	
	public void tour(){
		int position = joueur.deplacement();
		JOptionPane message = new JOptionPane();
		message.showMessageDialog(message, "Deplacement "+position);
	}
	
	public void initialisationPartie(){
		partie = new Case[40];
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
		
		Player joueur = new Player("Bob", 1);
		Partie partie = new Partie(joueur);
	
	}
}
=======
package heritage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import entite.Player;

public class Partie implements KeyListener{
	
	private Case[] partie;
	private Player joueur;

	public Partie(Player joueur){
		this.joueur=joueur;
	}
	
	public void tour(){
		int position = joueur.deplacement();
		JOptionPane message = new JOptionPane();
		message.showMessageDialog(message, "Deplacement "+position);
	}
	
	public void initialisationPartie(){
		partie = new Case[40];
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
		
		Player joueur = new Player("Bob", 1);
		Partie partie = new Partie(joueur);
	
	}
}
>>>>>>> 3c735e2fe0c28ac47720a7cd050ca81560d33c3e
