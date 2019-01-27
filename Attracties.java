
public abstract class Attracties {
	String naam;
	double price;
	int oppervlakte;
	double attractieWinst;
	int hoeveelGedraaid;
	double totalBelasting;
	
	Attracties(String naam, double price, int oppervlakte, double attractieWinst, int hoeveelGedraaid){
		this.naam = naam;
		this.price = price;
		this.oppervlakte = oppervlakte;
		this.attractieWinst = attractieWinst;
		this.hoeveelGedraaid = hoeveelGedraaid;
	}
	
	void attractieDraait() {
		hoeveelGedraaid++;
		System.out.println(naam + " draait!");
	}
	
	public abstract void risicoRijkeAttracties();
}

class Botsauto extends Attracties{
	Botsauto() {
		super("botsautos", 2.50, 10, 0, 0);
	}

	@Override
	public void risicoRijkeAttracties() {
			
	}	
}

class Spin extends Attracties{
	Spin() {
		super("Spin", 2.25, 6, 0, 0);
	}

	@Override
	public void risicoRijkeAttracties() {
		if(hoeveelGedraaid%5 == 0) {
			System.out.println("Attractie ondergaat keuring.");
		}		
	}	
}

class Spiegelpaleis extends Attracties{
	Spiegelpaleis() {
		super("Spiegelpaleis", 2.75, 8, 0, 0);
	}

	@Override
	public void risicoRijkeAttracties() {		
	}	
}

class Spookhuis extends Attracties{
	Spookhuis() {
		super("Spookhuis", 3.20, 12, 0, 0);
	}

	@Override
	public void risicoRijkeAttracties() {
		
	}	
}

class Hawaii extends Attracties{
	Hawaii() {
		super("Hawaii", 2.90, 9, 0, 0);
	}

	@Override
	public void risicoRijkeAttracties() {
		if(hoeveelGedraaid%10 == 0) {
			System.out.println("Attractie ondergaat keuring.");
		
	}	
}}

class Ladderklimmen extends Attracties implements GokAttractie{
	Ladderklimmen() {
		super("ladderklimmen", 5.00, 3, 0, 0);
	}

	@Override
	public void risicoRijkeAttracties() {
	}
	

	@Override
	public void belastingTeller() {
		double belasting = belastingTarief*price;
		totalBelasting += belasting;
		System.out.println("Belasting is " + totalBelasting);
	}
}