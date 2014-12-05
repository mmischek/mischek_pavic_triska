/**
 * 
 */
package teamarbeit;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Klasse zur Berechnung vom Minimum, Maximum und der Summe
 * 
 * @author Toni
 * @version v1.0 / 05.12.2014
 */
public class Zahlen {

	@SuppressWarnings("unused")
	private int summe;
	
	LinkedList<Double> list = new LinkedList<Double>();

	/**
	 * Standart Konstruktor
	 */
	public Zahlen() {
		this.list= new LinkedList<Double>();

	}

	/**
	 * �bernimmt ein neues Element und f�gt es der Liste hinzu
	 * 
	 * @param zahl
	 *            element das hinzugef�gt wird
	 */
	public void add(double zahl) {
		list.add(zahl);
	}

	/**
	 * Berechnet die Summe
	 * 
	 * @return gibt die Summe der Zahlen zur�ck
	 */
	public double summe() {
		double s = 0;

		for (double i : list) {
			s += i;
		}
		return s;

	}

	/**
	 * Berechnet das Maximum
	 * 
	 * @return gibt das maximum zur�ck gelöst von Pavic
	 */
	public double maximum() {
		double current = 0;
		for (double i : list) {
			if (current < i) {
				current = i;
			}
		}
		return current;

	}

	/**
	 * Berechnet das Minimum
	 * 
	 * @return gibt das minimum zur�ck gelöst von Pavic (erkennt 0 als min Wert,
	 *         wobei dieser BEIM Testen nicht hinzufügt wurde)
	 */
	public double minimumPavic() {
		double current = 0;
		for (double i : list) {
			if (current > i) {
				current = i;
			}
		}
		return current;

	}

	/**
	 * so waere es auch möglich die Methode zu schreiben 
	 * geschrieben von Mischek
	 * (wird verwendet)
	 * @return Maximum
	 */
	public double minimum() {
		return Collections.min(list);

	}
}
