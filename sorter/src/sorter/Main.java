package sorter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int vet[],i,j,reserva;
		vet = new int[10];
		Scanner e = new Scanner(System.in);
		for (i=0;i<10;i++)
			vet[i] = e.nextInt();
		
		for (j=9;j>0;j--)
			for (i=0;i<9;i++)
				if(vet[i+1]<vet[i]) {
					reserva = vet[i];
					vet[i]=vet[i+1];
					vet[i+1]=reserva;
					j++;
				}
		System.out.println("Sorted: ");
		for (i=0;i<10;i++)
			System.out.println(vet[i]);
		e.close();
	}
}
