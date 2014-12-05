package teamarbeit;

/**
 * Klasse zur Berechnung diverser Flächen.
 * 
 * @author Florian Triska
 * @version 1.0
 */
public class Flaechen {

	private double laenge;
	private double breite;
	private double radius;
	private double a, b, c;

	/**
	 * @param laenge
	 * @param breite
	 * @param radius
	 * @param a
	 * @param b
	 * @param c
	 */
	public Flaechen(double laenge, double breite, double radius, double a,
			double b, double c) {
		this.laenge = laenge;
		this.breite = breite;
		this.radius = radius;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Konstruktor fuer Rechteck
	 * 
	 * @param laenge
	 * @param breite
	 */
	public Flaechen(double laenge, double breite) {

		this.laenge = laenge;
		this.breite = breite;
	}

	/**
	 * Konstruktor fuer Kreis
	 * 
	 * @param radius
	 */
	public Flaechen(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * Konstruktor fuer Dreieck
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public Flaechen(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Methode zur Berechnung eines allgemeinen Rechtecks.
	 * 
	 * @param laenge
	 * @param breite
	 * @return flaeche rechteck
	 */
	public double rechteck() {

		return laenge * breite;
	}

	/**
	 * Methode zur Berechnung eines allgemeinen Kreises.
	 * 
	 * @param radius
	 * @return Flaeche von Kreis
	 */
	public double kreis() {

		return Math.PI * radius * radius;
	}

	/**
	 * Methode zur Berechnung eines allgemeinen Dreiecks.
	 * 
	 * @param hoehe
	 * @param seite
	 * @return Flaeche von Dreieck
	 */
	public double dreieck() {
		double seite = (a + b + c) / 2;
		return Math.sqrt(seite * (seite - a) * (seite - b) * (seite - c));
	}
}
