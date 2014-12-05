package teamarbeit;

/**
 * 
 * @author Matthias Mischek
 * @version 1.0
 */
public class Testen {

/**
 * main-Methode
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * Testen der Klasse Rauminhalt
		 */
		//Pyramide Methode wird getestet
		Rauminhalt pyramide = new Rauminhalt(5.8, 2.9, 3.5);
		System.out.println("Pyramide: \na = 2.8 | b = 2.9 | h = 3.5");
		System.out.println("Volumen: " + pyramide.pyramide()+"\n");
		
		//Kegel Methode wird getestet
		Rauminhalt kegel = new Rauminhalt(8.7, 5.9);
		System.out.println("Kegel: \nr = 8.7 | h = 5.9");
		System.out.println("Volumen: " + kegel.kegel()+"\n");
		
		//Quader Methode wird getestet
		Rauminhalt quader = new Rauminhalt(7.5, 5.6,3.2);
		System.out.println("Quader: \na = 7.5 | b = 5.6 | c = 3.2");
		System.out.println("Volumen: " + quader.quader()+"\n");
		
		/**
		 * Testen der Klasse Faeche
		 */
		//Rechteck Methode wird getestet
		Flaechen rechteck = new Flaechen(1.2, 3.2);
		System.out.println("Rechteck: \nLaenge = 1.2 | Breite = 3.2");
		System.out.println("Flaeche: " + rechteck.rechteck()+"\n");
		
		//Kreis Methode wird getestet
		Flaechen kreis = new Flaechen(2.6);
		System.out.println("Kreis: \nr = 2.6");
		System.out.println("Flaeche: " + kreis.kreis()+"\n");
		
		//Dreieck Methode wird getestet
		Flaechen dreieck = new Flaechen(5.6, 2.8, 4.1);
		System.out.println("Kreis: \na = 5.6 | b = 2.8 | c = 4.1");
		System.out.println("Flaeche: " + kreis.kreis()+"\n");
		
		
		
	}

}
