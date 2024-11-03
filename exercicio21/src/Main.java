import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float salario, aumento,novoSalario, percentual = 0;
		
		System.out.print("Digite o salario atual do funcionario: ");
		Scanner dado = new Scanner(System.in);
		salario = dado.nextFloat();
		if (salario<=280) {
			percentual = 20;
		}
		else {
			if (salario > 280 && salario <= 700) {
				percentual = 15;
			}
			else {
				if (salario > 700 && salario <= 1500) {
					percentual = 10;
				}
				else {
					if (salario>1500) {
						percentual = 5;
					}
				}
			}
		}
		aumento = salario * (percentual/100);
		novoSalario = salario+aumento;
		System.out.println("****************AJUSTE****************");
		System.out.printf("Salario antes do reajuste: R$%.2f\n",salario);
		System.out.printf("Percentual de aumento aplicado: %.0f%%\n",percentual);
		System.out.printf("Valor do aumento: R$%.2f\n",aumento);
		System.out.printf("Novo salario: R$%.2f\n",novoSalario);
		System.out.println("**************************************");
		
		
		dado.close();
	}
}