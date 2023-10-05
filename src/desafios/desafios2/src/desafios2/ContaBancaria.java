package desafios2;

import java.util.Scanner;

public class ContaBancaria {
	public static void main(String[] args) {
		// Lendo os dados de Entrada:
		Scanner scanner = new Scanner(System.in);
		int numeroConta = scanner.nextInt();
		scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
		String nomeTitular = scanner.nextLine();
		double saldo = scanner.nextDouble();

		// TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
		Banco banco = new Banco();

		banco.numero = numeroConta;
		banco.titular = nomeTitular;
		banco.saldo = saldo;

		// TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
		System.out.println("Conta: " + banco.numero);
		System.out.println("Titular: " + banco.titular);
		System.out.println(" Saldo: R$ " + banco.saldo);
	}
}

class Banco {
	int numero;
	String titular;
	double saldo;

	public void Bancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
}
