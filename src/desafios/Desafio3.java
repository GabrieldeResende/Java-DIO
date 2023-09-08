package desafios;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite seu saldo: ");
	    int saldoTotal = scanner.nextInt();
	    
	    System.out.println("Digite o total a sacar: ");
	    int valorSaque = scanner.nextInt();
	    
	    if(valorSaque > saldoTotal) {
	    	System.out.println("Saldo insuficiente. Saque nao realizado!");
	    } else {
	    	int novoSaldo = saldoTotal - valorSaque;
	    	System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
	    }

	}

}
