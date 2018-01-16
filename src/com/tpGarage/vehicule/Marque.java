package com.tpGarage.vehicule;

enum Marque {
/*
 * RENO : String
 * PIGEOT : String
 * TROEN : String
 */
	//Marque.RENO
	RENO("RENO"),
	PIGEOT("PIGEOT"),
	TROEN("TROEN");
	
	private String name = "";
	//Constructeur
	Marque(String name){
	    this.name = name;
	  }
	   
	public String toString(){
	    return name;
	  }
}
