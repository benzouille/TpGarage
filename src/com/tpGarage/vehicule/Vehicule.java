package com.tpGarage.vehicule;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import com.tpGagage.option.*;
import com.tpGarage.moteur.*;

public class Vehicule implements Serializable {

	private static final long serialVersionUID = 1567013183348680596L;
	protected String nom;
	protected Double prix;
	protected Marque nomMarque;
	protected List<Option> options = new LinkedList<Option>();
	protected Moteur moteur;

	public Vehicule() {

	}

	public Vehicule(String pnom, Marque pNomMarque, Moteur pMoteur) {
		this.nom = pnom;
		this.nomMarque = pNomMarque;
		moteur = pMoteur;
	}

	public void setMoteur(Moteur mot) {
		this.moteur = mot;
	}

	public void addOption(Option opt) {
		options.add(opt);	
	}

	public Marque getMarque() {
		return nomMarque;	
	}

	public List<Option> getOption() {
		return options;	
	}

	public Double getPrix() {
		Double totalOpt = 0.0;
		for(int i=0; i<options.size(); i++) {
			totalOpt += getOption().get(i).getPrix();
		}	
		prix = this.moteur.getPrix()+totalOpt;
		return prix;
		//prix total avec moteur et options

	}

	public String toString() {
		String str = "+ Voiture "+this.getMarque()+" : "+this.moteur.toString()+this.getOption()+" d'une valeur totale de : "+this.getPrix()+" €";
		return str;

	}
}
