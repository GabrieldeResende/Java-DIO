package contaBanco;
import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		String nome;
		String agencia;
		int numeroConta;
		double saldo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a Agencia: ");
		agencia = sc.nextLine();
		
		System.out.println("Digite o numero da Conta: ");
		numeroConta = sc.nextInt();
		
		System.out.println("Digite o saldo de deposito: ");
		saldo = sc.nextDouble();
		
		System.out.println("Ola " + nome + " Sua agencia é: " + agencia + " Conta: " + numeroConta + " e seu saldo: " + saldo);
	}

}
