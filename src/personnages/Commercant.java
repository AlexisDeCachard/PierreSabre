package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentVol = argent;
		perdreArgent(argentVol);
		parler("J'ai tout perdu! C'est vraiment trop injuste...");
		return argentVol;
	}
	
	public void recevoirArgent(int argent) {
		if (argent > 0) {
			gagnerArgent(argent);
			parler(argent + " sous ! Je te remercie généreux donateur!");
		}
	}
	
}
