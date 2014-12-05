package teamarbeit;



public class Rauminhalt {
	
	private double a,b,c,r,h;
	

	public double pyramide(){
		return (a*a*h)/3;
	}
	
	
	public double kegel(){
		return ((Math.PI*r*r)*h)/3;
		
	}
	
	public double quader(){
		return (a*b*c);
		
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
