package fr.cda.TpCalculJSP.web;

public class CalculPrixModel {

	private float prix;
	private float tva;
	private float resultat;
	
	public CalculPrixModel(float prix, float tva, float resultat) {
		this.prix=prix;
		this.tva=tva;
		this.resultat=resultat;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float getTva() {
		return tva;
	}

	public void setTva(float tva) {
		this.tva = tva;
	}

	public float getResultat() {
		return resultat;
	}

	public void setResultat(float resultat) {
		this.resultat = resultat;
	}
	
}
