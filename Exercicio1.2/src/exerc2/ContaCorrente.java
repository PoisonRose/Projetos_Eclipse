package exerc2;

public class ContaCorrente{
	private double saldo;
	public String nome;
	
	//construtor com saldo padrão 0
	public ContaCorrente(String nome) {
		this.nome = nome;
		this.saldo = 0;
	}
	//construtor com saldo padrão customizado
	public ContaCorrente(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	//método que retorna o saldo
	public double obterSaldo() {
		return saldo;
	}
	//método que mostra o saldo na tela
	public void mostrarSaldo() {
		System.out.printf("O saldo de %s eh de R$%.2f\n",nome, saldo);
	}
	
	//método para depositar uma quantia.
	public void depositar(double valor) {
		if (valor >= 1) {
			this.saldo += valor;
			System.out.println("Deposito realizado com sucesso!");
		}
		else {
			System.out.println("O valor nao pode ser depositado, insira um valor valido.");
		}	
	}
	
	//método para saque.
	public void sacar(double valor) {
		if (valor>(saldo+(valor*0.005))) {
			System.out.println("Esta quantia nao pode ser sacada!");
		}
		else {
			this.saldo -= valor+valor*0.005;
			System.out.printf("Taxa de R$%.2f cobrada! Saque realizado com sucesso!\n", valor*0.005);
		}
	}
	
	

}
