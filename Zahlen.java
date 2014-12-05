/**
 * 
 */
package teamarbeit;

import java.util.LinkedList;

/**
 * @author Toni
 *
 */
public class Zahlen {

	private int summe;
	LinkedList<Double> list = new LinkedList<Double>();

	public Zahlen() {
		int summe;
		
	}
	
	public void add(double zahl){
		list.add(zahl);
	}

	public double Summe() {
		double s = 0;
		
		for(double i : list){
			s =+ i;
		}
		return s;
		
		
		
	}

	public double Maximum() {
		double current = 0;
		for(double i : list){
				if(current < i){
					current = i;
				}
		}
		return current;
		
		
	}


	public double Minimum() {
		double current = 0;
		for(double i : list){
				if(current > i){
					current = i;
				}
		}
		return current;
		
	}
}
