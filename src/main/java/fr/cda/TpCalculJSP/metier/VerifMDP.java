package fr.cda.TpCalculJSP.metier;

public class VerifMDP {
	
	public boolean verifMDP(String login, String mdp) {
		
		if(login.equals("Toto") && mdp.equals("toto123")) {
			return true;
		}
		else return false;
	}
}
