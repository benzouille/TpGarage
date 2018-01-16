package com.tpGarage.moteur;

public class MoteurDiesel extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3524021549316530884L;
	protected String cylindre;
	protected Double prix;
	protected TypeMoteur type;

	public MoteurDiesel() {
		super();
		type = TypeMoteur.DIESEL;
	}

	public MoteurDiesel(String puissance, Double prx ) {
		this.cylindre = puissance;
		this.prix = prx;
		type = TypeMoteur.DIESEL;
	}
	
	public String toString() {
		String str = "Moteur "+this.type+" "+this.cylindre+" ("+this.prix+" €)";
		return str;	
	}
	
	public Double getPrix() {
		return this.prix;
	}
}
