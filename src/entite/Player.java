package entite;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	private String name = "";
	private ArrayList proprietes= new ArrayList<>();
	private int id = 0;
	
	private AtomicInteger at = new AtomicInteger();
	
	public Player(){}
	
	public Player(String name){
		this.name = name;
		this.id = at.addAndGet(1);
	}
	public Player(String name, int id){
		this.name = name;
		this.id = id;
	}
	
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
	
	public Des move(){
		return new Des();
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + ", proprietes=" + proprietes + "]";
	}
}
