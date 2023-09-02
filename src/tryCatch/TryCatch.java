package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		String nome;
		int agencia;
		int numeroConta;
		double saldo;

		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();

		System.out.println("Digite a Agencia: ");
		agencia = sc.nextInt();

		System.out.println("Digite o numero da Conta: ");
		numeroConta = sc.nextInt();

		System.out.println("Digite o saldo de deposito: ");
		saldo = sc.nextDouble();

		System.out.println("Ola " + nome + " Sua agencia é: " + agencia + " Conta: " + numeroConta + " e seu saldo: " + saldo);
		} catch(InputMismatchException e) {
			System.err.println("Os campos agencia e numero da conta devem ser numericos!");
		}	
	}

}
