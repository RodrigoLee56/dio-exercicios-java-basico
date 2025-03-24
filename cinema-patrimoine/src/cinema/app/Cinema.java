package cinema.app;

import cinema.Billet;
import cinema.BilletTarifReduit;
import cinema.Billetfamilial;

public class Cinema {
	public static void main(String[] args) {
		// Création d'un billet standard
		Billet billetStandard = new Billet(20.0, "Avatar", true);
		System.out.println("Billet standard: "+billetStandard.getDetails());
		
		// Création d'un billet à tarif reduit
		BilletTarifReduit billetReduit = new BilletTarifReduit(20.0, "Avatar", true);
		System.out.println("Billet à tarif reduit: "+billetReduit.getDetails());
		
		
		// Création d'un billet familial
		Billetfamilial billetfamilial = new Billetfamilial(20.0, "Avatar", true, 4);
		System.out.println("Billet familial: "+ billetfamilial.getDetails());
	}
}
