package personnages;

public class Humain {
	private String nom;
	private String boissonPreferee;
	private int argent;
	protected Humain[] memoire = new Humain[30];
	protected int nbConnaissance = 0;

	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPreferee + ".");
	}

	public void boire() {
		parler("Mmmmh, un bon verre de " + boissonPreferee + " ! GLOUPS !");
	}

	public void acheter(String objet, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + "  sous en poche. Je ne peux pas même pas m'offrir " + objet + " à "
					+ prix + " sous.");
		} else {
			parler("J' ai " + argent + "  sous en poche. Je vais pouvoir m'offrir " + objet + " à " + prix + " sous.");
			perdreArgent(prix);
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
		if (argent < 0) {
			argent = 0;
		}
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}

	private void memoriser(Humain autreHumain) {
		boolean dejaConnu = false;
		for (int i=0; i<nbConnaissance;i++) {
			if (memoire[i].equals(autreHumain)) {
				dejaConnu = true;
			}
		}
		if (!dejaConnu) {
			if (nbConnaissance < memoire.length) {
				memoire[nbConnaissance] = autreHumain;
				nbConnaissance++;
			} else {
				for (int i = 1; i < nbConnaissance; i++) {
					memoire[i - 1] = memoire[i];
				}
				memoire[nbConnaissance - 1] = autreHumain;
			}
		}
	}

	public void listerConnaissance() {
		StringBuilder chaine = new StringBuilder("Je connais beaucoup de monde");
		if (nbConnaissance > 0) {
			chaine.append(" dont: ");
		}
		for (int i = 0; i < nbConnaissance; i++) {
			chaine.append(memoire[i].getNom());
			if (i + 1 < nbConnaissance) {
				chaine.append(", ");
			}
		}
		chaine.append(".");
		parler(chaine.toString());
	}
}
