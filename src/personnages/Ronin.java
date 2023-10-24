package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDon = (argent*10)/100;
		parler(beneficiaire.getNom() +" prend ces " + argentDon + " sous.");
		perdreArgent(argentDon);
		beneficiaire.recevoirArgent(argentDon);
	}
}
