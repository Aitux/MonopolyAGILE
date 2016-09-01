package heritage;

import java.util.ArrayList;

import entite.Player;

public abstract class Propriete extends Case
{
//////////////////////////////////////////////////////////////////////////////
					// ATTIBUTS //
//////////////////////////////////////////////////////////////////////////////
	
	protected Player Proprietaire=null;
	protected String nom;
	protected int prixAchat;
	protected int loyeractuel;
	protected ArrayList<Propriete> itemadjointes;
	protected ArrayList<Integer> prixtab;
	boolean possede=false;
	//Prix en ordre croissant
	

//////////////////////////////////////////////////////////////////////////////
					// METHODES //
//////////////////////////////////////////////////////////////////////////////
	
	
	public Propriete(String nom, int prixAchat, ArrayList<Integer> prixtab) {
		super(nom);
		this.prixAchat=prixAchat;
		this.prixtab=prixtab;
		
	}
	
	public void setTrueBoolean(){
		possede=true;
	}
	
	public abstract int Loyer();
	
	
	
	
	
	

}
