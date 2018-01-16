package com.tpGarage.moteur;

public class MoteurHybride extends Moteur {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8105464789701713922L;
	protected String cylindre;
	protected Double prix;
	protected TypeMoteur type;

	public MoteurHybride() {
		super();
		type = TypeMoteur.HYBRIDE;
	}

	public MoteurHybride(String puissance, Double prx ) {
		this.cylindre = puissance;
		this.prix = prx;
		type = TypeMoteur.HYBRIDE;
	}
	
	public String toString() {
		String str = "Moteur "+this.type+" "+this.cylindre+" ("+this.prix+" €)";
		return str;		
	}
	
	public Double getPrix() {
		return this.prix;
	}
}
