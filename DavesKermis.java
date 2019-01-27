import java.util.Scanner;
import java.lang.*;

public class DavesKermis {

	public static void main(String[] args) {
		
		boolean iLoveKermis = true;
		double totaleWinst;
		Attracties botsauto = new Botsauto();
		Attracties spin = new Spin();
		Attracties spookhuis = new Spookhuis();
		Attracties spiegelpaleis = new Spiegelpaleis();
		Attracties hawaii = new Hawaii();
		Attracties ladderklimmen = new Ladderklimmen();
		
		System.out.println("Welkom. Maak een keuze AUB:\n1. Botsautos draaien.\n2. Spin draaien.\n3. Spookhuis draaien"
				+ "\n4. Spiegelpaleis draaien.\n5. Hawaii draaien.\n6. Ladderklimmen draaien.\no. Omzet tonen.\nk. Verkochte kaartjes tonen.\nb. "
				+ "Belasting betalen.\na. Afsluiten.");
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------\n");
		
		Scanner choice = new Scanner(System.in);	
		
		while(iLoveKermis) {
					totaleWinst = (botsauto.hoeveelGedraaid*botsauto.price) + (spin.hoeveelGedraaid*spin.price)+ (spookhuis.hoeveelGedraaid*spookhuis.price)
					+ (spiegelpaleis.hoeveelGedraaid*spiegelpaleis.price)+ (hawaii.hoeveelGedraaid*hawaii.price)+ (ladderklimmen.hoeveelGedraaid*ladderklimmen.price);
		String input = choice.nextLine();
			switch (input) {
				case"1": botsauto.attractieDraait();
				break;
				case"2": spin.attractieDraait();
						 spin.risicoRijkeAttracties();
				break;
				case"3": spookhuis.attractieDraait();
				break;
				case"4": spiegelpaleis.attractieDraait();
				break;
				case"5": hawaii.attractieDraait();
						 hawaii.risicoRijkeAttracties();
				break;
				case"6": ladderklimmen.attractieDraait();
						 ((Ladderklimmen) ladderklimmen).belastingTeller();
				break;
				case"o": System.out.println("Attractienaam\tOmzet\n__________________________________\n\n" 
						+ botsauto.naam + "\t" + (botsauto.hoeveelGedraaid*botsauto.price) + "\n"
						+ spin.naam+ "\t\t" + (spin.hoeveelGedraaid*spin.price) + "\n"+ spookhuis.naam+ "\t" + (spookhuis.hoeveelGedraaid*spookhuis.price) + "\n"
						+ spiegelpaleis.naam+ "\t" + (spiegelpaleis.hoeveelGedraaid*spiegelpaleis.price) + "\n"+ hawaii.naam+ "\t\t" + (hawaii.hoeveelGedraaid*hawaii.price) + "\n"
						+ ladderklimmen.naam+ "\t" + (ladderklimmen.hoeveelGedraaid*ladderklimmen.price) + "\nTotaal\t\t" + totaleWinst);
				break;
				case"k": System.out.println("Attractienaam\tVerkochte kaartjes\n__________________________________\n\n" 
						+ botsauto.naam + "\t" + botsauto.hoeveelGedraaid + "\n"
						+ spin.naam+ "\t\t" + spin.hoeveelGedraaid + "\n"+ spookhuis.naam+ "\t" + spookhuis.hoeveelGedraaid + "\n"
						+ spiegelpaleis.naam+ "\t" + spiegelpaleis.hoeveelGedraaid + "\n"+ hawaii.naam+ "\t\t" + hawaii.hoeveelGedraaid + "\n"
						+ ladderklimmen.naam+ "\t" + ladderklimmen.hoeveelGedraaid + "\n");
				break;
				case"b": System.out.println(ladderklimmen.totalBelasting + " belasting betaald.");
						 totaleWinst -= ladderklimmen.totalBelasting;
						 ladderklimmen.totalBelasting = 0;
						 System.out.println("Omzet is nu " + totaleWinst);
				break;
				case"a": iLoveKermis = false;
						 System.out.println("Tot ziens.");
				break;
				default: System.out.println("Please choose one of our wonderful rides and attractions.");
				break;
			}
		}
	}

}