package fr.cda.TpCalculJSP.metier;

public class CalculPrix {

	public float prixTTC(float prix, float tva) {
		return prix * (1+(tva/100));
	}
}
