package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	protected int argent;
	
	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
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
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPref + ".");
	}
	
	public void boire() {
		parler("Mmmmh, un bon verre de " + boissonPref + " ! GLOUPS !" );
	}
	
	public void acheter(String objet, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + "  sous en poche. Je ne peux pas m�me pas m'offrir " + objet + " � " + prix + " sous.");
		}
		else {
			parler("J' ai " + argent + "  sous en poche. Je vais pouvoir m'offrir " + objet + " � " + prix + " sous.");
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
}
