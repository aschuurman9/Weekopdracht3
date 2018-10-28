package weekopdracht3;

import java.util.ArrayList;

public class Belastinginspecteur {
	static double totaalBelasting;
	double totaalTeInnenBelasting;
	double belastingPerAttractie;
	ArrayList <GokAttractie> gokAttractiesLijst = new ArrayList<>();
	double belastingGeind;

	public void checkenGokAttractie(ArrayList<Attractie> attractielijst) {
		for (int i = 0; i < attractielijst.size(); i++) {
			if (attractielijst.get(i) instanceof GokAttractie) {
				belastingInnen((GokAttractie) attractielijst.get(i));
			}
			}
	}
	
	public double belastingInnen(GokAttractie a) {
		totaalTeInnenBelasting = ((GokAttractie) a).kansSpelBelastingReserveren(a);
		return totaalTeInnenBelasting;
	}

}

/*
public void belastingInnen(GokAttractie a) {
	double teBetalen = a.kansSpelBelastingReserveren(a);
	belastingPerAttractie = belastingPerAttractie + teBetalen;
	nogTeInnenBelasting = nogTeInnenBelasting + teBetalen;
	totaalBelasting = totaalBelasting + teBetalen;
//		((Attractie) a).omzetAtrractieBerekenen((Attractie) a);
}
public double belastingInnen(ArrayList<GokAttractie> gokattractieslijst) {
	totaalTeInnenBelasting = 0;
	for(GokAttractie a : gokattractieslijst) {
		totaalTeInnenBelasting = totaalTeInnenBelasting + a.kansSpelBelastingReserveren(a);
		System.out.println("in belastingInnen: " + totaalTeInnenBelasting);
	}
	return totaalTeInnenBelasting;
}
public ArrayList<GokAttractie> checkenGokAttractie(ArrayList<Attractie> attractielijst) {
	for (int i = 0; i < attractielijst.size(); i++) {
		if (attractielijst.get(i) instanceof GokAttractie) {
//				belastingInnen((GokAttractie) attractielijst.get(i));
			gokAttractiesLijst.add((GokAttractie) attractielijst.get(i));
		}
	}
	return gokAttractiesLijst;
}
 */