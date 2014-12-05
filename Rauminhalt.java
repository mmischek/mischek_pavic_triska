package teamarbeit;

/**
 * 
 * @author Matthias Mischek
 * @version 1.0
 */

public class Rauminhalt {

	private double a, b, c, r;

	/**
	 * Standart Konstruktor
	 */
	public Rauminhalt() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.r = 0;
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @param r
	 * @param h
	 */
	public Rauminhalt(double a, double b, double c, double r) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.r = r;

	}

	/**
	 * Konstruktor fuer Pyramide und Quader
	 * @param a
	 * @param b
	 * @param h
	 */
	public Rauminhalt(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	/**
	 * Konstruktor fuer Kegel
	 * @param a
	 * @param b
	 * @param c
	 * @param r
	 * @param h
	 */
	public Rauminhalt(double r, double c) {
		this.r = r;
		this.c = c;
	}


	/**
	 * Methode zum berechnen des Volumes einer Pyramide
	 * @return Rauminhalt von Pyramide
	 */
	public double pyramide() {
		return (a * b * c) / 3;
	}

	/**
	 *  Methode zum berechnen des Volumes eines Kegels
	 * @return Rauminhalt von Kegel
	 */
	public double kegel() {
		return ((Math.PI * r * r) * c) / 3;

	}

	/**
	 * Methode zum berechnen des Volumes eines Quaders
	 * @return Rauminhalt von  Quader
	 */
	public double quader() {
		return (a * b * c);

	}


}
