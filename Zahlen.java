/**
 * 
 */
package teamarbeit;

import java.util.LinkedList;

/**
 * Klasse zur Berechnung vom Minimum, Maximum und der Summe
 * 
 * @author Toni
 * @version v1.0 / 05.12.2014
 */
public class Zahlen {

	private int summe;
	LinkedList<Double> list = new LinkedList<Double>();

	/**
	 * Standartkonstruktor
	 */
	public Zahlen() {
		int summe;
		
	}
	/**
	 * �bernimmt ein neues Element und f�gt es der Liste hinzu
	 * @param zahl element das hinzugef�gt wird
	 */
	public void add(double zahl){
		list.add(zahl);
	}
	
	/**
	 * Berechnet die Summe
	 * @return gibt die Summe der Zahlen zur�ck
	 */
	public double summe() {
		double s = 0;
		
		for(double i : list){
			s =+ i;
		}
		return s;
		
		
		
	}
	/**
	 * Berechnet das Maximum
	 * @return gibt das maximum zur�ck
	 */
	public double maximum() {
		double current = 0;
		for(double i : list){
				if(current < i){
					current = i;
				}
		}
		return current;
		
		
	}

/**
 * Berechnet das Minimum
 * @return gibt das minimum zur�ck
 */
	public double minimum() {
		double current = 0;
		for(double i : list){
				if(current > i){
					current = i;
				}
		}
		return current;
		
	}
}
