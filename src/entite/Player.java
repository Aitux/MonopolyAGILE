package entite;

import java.util.ArrayList;

public class Player {
	private String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ArrayList getProprietes() {
		return proprietes;
	}


	public void setProprietes(ArrayList proprietes) {		
		this.proprietes = proprietes;
	}


	private int id;
	private ArrayList proprietes= new ArrayList<>();
	
	public Player(String name){
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + ", proprietes=" + proprietes + "]";
	}
}
