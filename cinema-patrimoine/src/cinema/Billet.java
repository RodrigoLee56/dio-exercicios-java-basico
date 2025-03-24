package cinema;

public class Billet {
	protected double prixDuBillet;
	protected String titreDuFilm;
	protected boolean estDublado;

	// Constructeur
	public Billet(double prixDuBillet, String titreDuFilm, boolean estDublado) {
		this.prixDuBillet = prixDuBillet;
		this.titreDuFilm = titreDuFilm;
		this.estDublado = estDublado;
	}

	// Méthode pour obtenir le prix réel du billet
	public double getPrixDuBilletReel() {
		return this.prixDuBillet;
	}

	// Méthode pour afficher les détails du billet
	public String getDetails() {
		String typeAudio = estDublado ? "doublée" : "sous-titré";
		return String.format("Film: %s (%s), Prix: %.2f $", titreDuFilm, typeAudio, getPrixDuBilletReel());
	}

}
