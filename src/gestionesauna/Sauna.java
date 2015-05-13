package gestionesauna;

public class Sauna {
	private int ID;
	private double capienza;
	
	public Sauna(int iD, double capienza) {
		super();
		ID = iD;
		this.capienza = capienza;
	}

	public int getID() {
		return ID;
	}

	public double getCapienza() {
		return capienza;
	}
}
