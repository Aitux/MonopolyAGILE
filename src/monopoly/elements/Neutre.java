package monopoly.elements;

public class Neutre extends Case {

	public Neutre(String nom) {
		super(nom);
	}

	@Override
	public int Loyer() {
		return 0;
	}
	
}
