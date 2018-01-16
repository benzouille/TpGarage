package com.tpGagage.option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3641224362820442120L;
	Double prix = 562.9;
	String nom = "SiegeChauffant";
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
