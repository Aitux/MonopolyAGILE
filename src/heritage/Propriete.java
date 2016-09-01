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
	protected ArrayList<Propriete> rueadjointes;
	

//////////////////////////////////////////////////////////////////////////////
					// METHODES //
//////////////////////////////////////////////////////////////////////////////
	
	private void nommer()
	{}
	
	private void prixRue()
	{}
	
	private void prixGare()
	{}
	
	private void prixServicePublic()
	{}
	
	private void Loyer()
	{}
	
	
	
	
	

}
