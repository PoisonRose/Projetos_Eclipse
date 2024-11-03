package exercicio22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double valHora,horTrab,salBruto,ir,ir_prct=0,sind,fgts,descontos,salLiquido;
		
		System.out.print("Digite o valor por hora: ");
		Scanner valor = new Scanner(System.in);
		valHora = valor.nextFloat();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		Scanner horas = new Scanner(System.in);
		horTrab = horas.nextFloat();
		salBruto = valHora*horTrab;
		if (salBruto <= 900) {
		}
		else {
			if (salBruto <= 1500) {
				ir_prct = 5;
			}
			else {
				if (salBruto <= 2500) {
					ir_prct = 10;
				}
				else {
					if (salBruto > 2500) {
						ir_prct = 20;
					}
				}
			}
		}
		ir = salBruto * (ir_prct/100);
		sind = salBruto*0.03;
		fgts=salBruto*0.11;
		descontos = ir+sind;
		salLiquido = salBruto-descontos;
		
		System.out.println("***************TABELA***************");
		System.out.printf("Salario Bruto(%.2f * %.1f): R$%.2f\n",valHora,horTrab,salBruto);
		System.out.printf("(-)IR(%.0f%%): R$%.2f\n",ir_prct,ir);
		System.out.println("(-)Sindicato(3%): R$"+sind);
		System.out.println("FGTS(11%): R$"+fgts);
		System.out.println("Total de descontos: R$"+descontos);
		System.out.println("Salario Liquido: R$"+salLiquido);
		System.out.println("************************************");
		
		
		valor.close();
		horas.close();
	}

}
