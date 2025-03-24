package cinema;

public class Billetfamilial extends Billet {
	private int nombreDePersonnes;

	public Billetfamilial(double prixDuBillet, String titreDuFilm, boolean estDublado, int nombreDePersonnes) {
		super(prixDuBillet, titreDuFilm, estDublado);
		this.nombreDePersonnes = nombreDePersonnes;
	}

	// Redéfition de la méthod pour calculer le prix réel avec remise
	@Override
	public double getPrixDuBilletReel() {
		double prixTotal = this.prixDuBillet * this.nombreDePersonnes;
		if (this.nombreDePersonnes > 3) {
			prixTotal *= 0.95;
		}
		return prixTotal;
	}

	// Redéfinition de la méthod pour include le nombre de personnes
	@Override
	public String getDetails() {
		String typeAudio = estDublado ? "doublée" : "sous-titré";
		return String.format("Film: %s (%s), Nombre de personnes: %d, Prix: %.2f $", titreDuFilm, typeAudio,
				nombreDePersonnes, getPrixDuBilletReel());
	}

}
