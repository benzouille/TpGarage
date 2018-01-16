package com.tpGarage.moteur;

public class MoteurEssence extends Moteur {
	/**
	 * 
	 */
	private static final long serialVersionUID = -699945008788768012L;
	protected String cylindre;
	protected Double prix;
	protected TypeMoteur type;

	public MoteurEssence() {
		super();
		type = TypeMoteur.ESSENCE;
	}

	public MoteurEssence(String puissance, Double prx ) {
		this.cylindre = puissance;
		this.prix = prx;
		type = TypeMoteur.ESSENCE;
	}
	
	public String toString() {
		String str = "Moteur "+this.type+" "+this.cylindre+" ("+this.prix+" €)";
		return str;	
	}
	
	public Double getPrix() {
		return this.prix;
	}
}
