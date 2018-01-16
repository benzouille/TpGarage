package com.tpGagage.option;

import java.io.Serializable;

public class GPS implements Option, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2261388241881813112L;
	Double prix = 113.5;
	String nom = "GPS";
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
