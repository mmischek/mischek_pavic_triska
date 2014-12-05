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
		System.out.println("Kegel: \nr = 8,7 | h = 5.9");
		System.out.println("Volumen: " + kegel.kegel()+"\n");
		
		//Quader Methode wird getestet
		Rauminhalt quader = new Rauminhalt(7.5, 5.6,3.2);
		System.out.println("Quader: a = 7,5 | b = 5.6 | c = 3.2");
		System.out.println("Volumen: " + quader.quader());
		
		
	}

}
