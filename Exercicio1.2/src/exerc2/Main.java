package exerc2;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente("Eduardo");
		ContaCorrente conta2 = new ContaCorrente("Maria",1500);
		
		System.out.printf("O saldo de %s e de R$%.2f\n",conta1.nome,conta1.obterSaldo());
		conta1.depositar(-1220.75);
		conta1.depositar(1220.75);
		conta1.mostrarSaldo();
		
		conta2.mostrarSaldo();
		conta2.sacar(150000);
		conta2.sacar(150);
		conta2.mostrarSaldo();
	}

}
