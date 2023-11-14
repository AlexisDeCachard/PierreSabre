package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDon = (getArgent()*10)/100;
		parler(beneficiaire.getNom() +" prend ces " + argentDon + " sous.");
		perdreArgent(argentDon);
		beneficiaire.recevoirArgent(argentDon);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force= honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait !");
		if (force>= adversaire.getReputation()) {
			parler("Je t'ai eu, petit Yakuza !");
			int sommeGagnee= adversaire.perdre();
			gagnerArgent(sommeGagnee);
			honneur ++;
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			int sommePerdue = getArgent();
			adversaire.gagner(sommePerdue);
			perdreArgent(sommePerdue);
			honneur --;
		}
	}
}
