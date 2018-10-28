package weekopdracht3;

public abstract class RisicoRijkeAttractie extends Attractie {
	
	int draailimiet;

	abstract void opstellingsKeuring(); 
	
	public void onderhoudsbeurt() {
		System.out.println("Onderhoud nodig");
	}
}
