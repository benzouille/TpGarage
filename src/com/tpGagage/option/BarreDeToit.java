package com.tpGagage.option;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3025125998251195388L;
	Double prix = 29.9;
	String nom = "BarreDeToit";
	
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
