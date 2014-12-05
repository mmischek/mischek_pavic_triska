package teamarbeit;
/**
 * Klasse zur Berechnung diverser Flächen.
 * @author Florian Triska
 * @version 1.0
 */
public class Flaechen {
	/**
	 * Methode zur Berechnung eines allgemeinen Rechtecks.
	 * @param laenge
	 * @param breite
	 * @return
	 */
	public double rechteck(double laenge, double breite){
		
		return laenge*breite;
	}
	/**
	 * Methode zur Berechnung eines allgemeinen Kreises.
	 * @param radius
	 * @return
	 */
	public double kreis(double radius){
		
		return  Math.PI*2*radius;
	}
	/**
	 * Methode zur Berechnung eines allgemeinen Dreiecks.
	 * @param hoehe
	 * @param seite
	 * @return
	 */
	public double dreieck(double hoehe, double seite){
		
		return (hoehe*seite)/2;
	}
}
