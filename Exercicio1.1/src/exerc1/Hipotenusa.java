package exerc1;

public class Hipotenusa {
	double a,b,hipo;
	
	public double calcHip(double ladoA, double ladoB) {
		a = ladoA;
		b = ladoB;
		hipo = Math.sqrt((a*a)+(b*b));
		return hipo;
	}
}
