package weekopdracht3;

public class Spin extends RisicoRijkeAttractie {

	
	Spin(String naam, double prijs) {
		naamAttractie = naam; 
		this.prijs = prijs;
		draailimiet = 5; 
		
	}
	
	void opstellingsKeuring() {
		System.out.println("Opstellingskeuring Spin\n");
	}


}
