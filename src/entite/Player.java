package entite;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import monopoly.elements.Propriete;
	
public class Player {
	private String name = "";
	private int position = 0;
	private ArrayList<Propriete> proprietes = new ArrayList<Propriete>();
	private int id = 0;
	private int argent = 1500;
	public int prison = 0;

	public int getPrison() {
		return prison;
	}

	public void setPrison(int prison) {
		this.prison = prison;
	}

	private AtomicInteger at = new AtomicInteger();

	public Player() {
	}

	public Player(String name) {
		this.name = name;
		this.id = at.addAndGet(1);
	}

	public Player(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Player(String name, int id, int argent) {
		this.name = name;
		this.id = id;
		this.argent = argent;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void giveArgent(int argent) {
		this.argent += argent;
	}

	public void pickOffArgent(int argent) {
		this.argent -= argent;
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

	public void move(int nb) {
		if (position + nb < 40)
			position = position += nb;
		else if(position +nb >=40){
			position = nb + position - 40;
			giveArgent(200);
		}
	}

	public void addCase(Propriete case1) {
		proprietes.add(case1);
	}
	
	@Override
	public String toString() {
		return "Player [name= " + name + ", id= " + id + ", argent= " + argent
				+ "]";
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
