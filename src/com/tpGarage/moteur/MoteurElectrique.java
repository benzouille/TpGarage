package com.tpGarage.moteur;

public class MoteurElectrique extends Moteur {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2382095857949164597L;
	protected String cylindre;
	protected Double prix;
	protected TypeMoteur type;

	public MoteurElectrique() {
		super();
		type = TypeMoteur.ELECTRIQUE;
	}

	public MoteurElectrique(String puissance, Double prx ) {
		this.cylindre = puissance;
		this.prix = prx;
		type = TypeMoteur.ELECTRIQUE;
	}
	
	public String toString() {
		String str = "Moteur "+this.type+" "+this.cylindre+" ("+this.prix+" €)";
		return str;	
	}
	
	public Double getPrix() {
		return this.prix;
	}
}
