package personnages;

public class Traitre extends Samourai{
	private int traitrise=0;
	
	public Traitre(String seigneur, String nom, String boissonPref, int argent) {
		super(seigneur,nom, boissonPref, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est: " + traitrise+". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (traitrise<3) {
			int argentRanconner=commercant.getArgent() *2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			traitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + argentRanconner+ " sous ou gare à toi !");
			commercant.parler("Tout de suite, grand "+getNom()+".");
		} else {
			parler("Mince, je ne peux plus ranconner personne sinon un samourai risque de me démasquer !");
		}
	}
}
