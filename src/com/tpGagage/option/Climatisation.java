package com.tpGagage.option;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5666009487247538334L;
	Double prix = 347.3;
	String nom ="Climatisation";
	
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
