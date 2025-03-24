package cinema;

public class BilletTarifReduit extends Billet {

	// Constructeur
	public BilletTarifReduit(double prixDuBillet, String titreDuFilm, boolean estDublado) {
		super(prixDuBillet, titreDuFilm, estDublado);
	}

	// Redéfinition de la méthode pour calculer le prix réel (50% du prix original)
	@Override
	public double getPrixDuBilletReel() {
		return this.prixDuBillet / 2;
	}
}
