package fr.cda.TpCalculJSP.web;

public class CalculModel {

	private int nombre1;
	private int nombre2;
	private int resultat;
	
	public CalculModel(int nombre1, int nombre2, int resultat) {
		this.nombre1=nombre1;
		this.nombre2=nombre2;
		this.resultat=resultat;
	}

	public int getNombre1() {
		return nombre1;
	}

	public void setNombre1(int nombre1) {
		this.nombre1 = nombre1;
	}

	public int getNombre2() {
		return nombre2;
	}

	public void setNombre2(int nombre2) {
		this.nombre2 = nombre2;
	}

	public int getResultat() {
		return resultat;
	}

	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	
}
