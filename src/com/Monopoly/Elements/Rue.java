package com.Monopoly.Elements;

import java.util.ArrayList;

public class Rue extends Propriete{
	private int maisons=0;
	private String Color;
	
	public Rue(String nom, int prixAchat, ArrayList<Integer> prixtab, String Color) {
		super(nom, prixAchat, prixtab);
		this.Color=Color;
	}
	
	public int Loyer(){
		int terraintotal=0;
		int prixloyer=super.prixtab.get(1);
		for(Propriete terrain : super.itemadjointes){
			if(terrain.Proprietaire.getId()==this.Proprietaire.getId()){
				terraintotal++;
			}
		}	
		if(terraintotal==super.itemadjointes.size()){
			prixloyer=super.prixtab.get(2);
			if(maisons!=0){
				prixloyer=super.prixtab.get(2+maisons);
			}
		}
		return prixloyer;
	}
	
}