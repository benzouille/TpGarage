package com.tpGagage.option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5817064301778196282L;
	Double prix = 212.35;
	String nom = "VitreElectrique";
	public Double getPrix() {
		return this.prix ;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public String toString()
	{
		String str = this.prix + " " + this.nom;
		return str;
	}
}
