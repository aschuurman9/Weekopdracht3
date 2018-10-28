package weekopdracht3;

public class Ladderklimmen extends Attractie implements GokAttractie {

	public Ladderklimmen(String naam, double prijs) {
		naamAttractie = naam;
		this.prijs = prijs;
	}

	
	public double kansSpelBelastingReserveren(GokAttractie a) {
		double kansSpelBelasting = 0;
		kansSpelBelasting = (((Attractie) a).omzetAtrractieBerekenen((Attractie) a)/100)*30;
		System.out.println("kansspelbelasting reserveren: " + kansSpelBelasting + "\n");
		return kansSpelBelasting;
	}

}
