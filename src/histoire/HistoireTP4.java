package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "koumacha", 54);
		prof.direBonjour();
		prof.acheter("une boisson",12);
		prof.boire();
		prof.acheter("un jeu",2);
		prof.acheter("kimono",50);
		Commercant marco = new Commercant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		marco.acheter("une théière",20);
		Yakuza yaku = new Yakuza("Yaku le Noir","sake",30,"Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
}
