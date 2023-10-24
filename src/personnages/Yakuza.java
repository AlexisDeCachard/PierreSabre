package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonPref, int argent, String clan) {
		super(nom, boissonPref, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler (victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int argentVol = victime.seFaireExtorquer();
		gagnerArgent(argentVol);
		parler("J'ai piqu� les " + argentVol + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
		reputation +=1;
	}
	
	public int perdre() {
		reputation -= 1;
		int argentPerte = argent;
		perdreArgent(argentPerte);
		parler("J'ai perdu mon duel et mes " + argentPerte + " sous, snif... J'ai d�shonor� le clan de " + clan);
		return argentPerte;
	}
	
	public void gagner(int gain) {
		argent += gain;
		reputation += 1;
		parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + clan + "? Je l'ai d�puill� de ses " + gain + " sous.");
	}
}
