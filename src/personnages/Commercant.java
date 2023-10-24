package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		int argentVol = argent;
		setArgent(0);
		parler("J'ai tout perdu! C'est vraiment trop injuste...");
		return argentVol;
	}
	
	public void recevoir(int argent) {
		if (argent > 0) {
			this.argent += argent;
			parler(argent + " sous ! Je te remercie g�n�reux donateur!");
		}
	}
	
}
