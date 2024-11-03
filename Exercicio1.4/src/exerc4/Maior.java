package exerc4;

public class Maior {
	double x=Double.NEGATIVE_INFINITY;
	int i;
	
	public double maior(double[] vet) {
		for (i=0;i<3;i++)
			if (vet[i]>x) {
				x = vet[i];
			}
		return x;
	}

}
