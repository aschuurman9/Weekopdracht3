package weekopdracht3;

import java.util.ArrayList;

public class Kassa {

	private double totaalOmzet;
	private double totaalInKassa;
	protected boolean bezoekBelastinginspecteur;
	
	public void totaalOmzetEnGeldInKassaBerekenen(ArrayList<Attractie> kermisattracties, Belastinginspecteur b) {
		totaalOmzet = 0;
		double omzetPerAttractie = 0;
		for (Attractie a : kermisattracties) {
			omzetPerAttractie = a.geefAantalVerkochteKaartjesAttractie() * a.prijs;
			totaalOmzet = totaalOmzet + omzetPerAttractie;
		}
		if (bezoekBelastinginspecteur) {
			double nuInnen = b.totaalTeInnenBelasting - b.belastingGeind;
			System.out.println("totaal te innen: " + b.totaalTeInnenBelasting + " al geind: " + b.belastingGeind + " nu innen: " + nuInnen);
			bezoekBelastinginspecteur = false;
			totaalInKassa = totaalInKassa - nuInnen;
//			totaalInKassa = totaalOmzet - b.belastingGeind;
			b.belastingGeind = b.totaalTeInnenBelasting;
			nuInnen = 0; 
		} else {
			totaalInKassa = totaalOmzet - b.belastingGeind;
		}
	}


	public double geefOmzet() {
		return totaalOmzet;
	}
	
	public double geefTotaalInKassa() {
		return totaalInKassa;
	}

}

/*
public void totaalOmzetBerekenen(ArrayList<Attractie> kermisattracties, Belastinginspecteur b) {
	totaalOmzet = 0;
	for (Attractie a : kermisattracties) {
		double omzetPerAttractie = a.geefAantalVerkochteKaartjesAttractie() * a.prijs;
		totaalOmzet = totaalOmzet + omzetPerAttractie - b.belastingGeind;
	}
	System.out.println("totale omzet zonder belastingbetalen: " + totaalOmzet);
	if (bezoekBelastinginspecteur) {
		double nuInnen = b.totaalTeInnenBelasting - b.belastingGeind;
		totaalOmzet = totaalOmzet - nuInnen;
		b.belastingGeind = b.totaalTeInnenBelasting;
		b.totaalTeInnenBelasting = 0;
		bezoekBelastinginspecteur = false;
		System.out.println("totale omzet - nog te innen belasting: " + totaalOmzet);
	} 
	System.out.println("Totaal omzet einde methode: " + totaalOmzet);
}
*/