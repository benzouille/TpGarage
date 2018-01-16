package com.tpGarage.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -8955445867772130066L;
	/*
 * type : TypeMoteur
 * cylindre : String
 * prix : Double
 * 
 * Moteur(cylindre : String, prix : Double) : void
 * toString() : String
 * getPrix() : Double
 */
	protected String cylindre;
	protected Double prix;
	protected TypeMoteur type;
	
	public Moteur() {
		cylindre = "inconnu";
		prix = 0.0;
		type = null;
	}
	
	public Moteur(String puissance, Double prx ) {
		this.cylindre = puissance;
		this.prix = prx;
	}
	
	public void setTypeMoteur(TypeMoteur sType) {
		this.type = sType;
	}
	
	public TypeMoteur getTypeMoteur() {
		return type;
	}
	
	public Double getPrix() {
		return this.prix;
	}

	public String toString() {
		String str = "Moteur "+this.type+" "+this.cylindre+" ("+this.prix+" €)";
		return str;	
	}
}
