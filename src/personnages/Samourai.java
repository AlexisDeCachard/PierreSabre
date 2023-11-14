package personnages;

public class Samourai extends Ronin{
	private String seigneur;
	
	public Samourai(String seigneur, String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
		this.seigneur=seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de mon seigneur " + seigneur + ".");
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+boisson+".");
	}
}
