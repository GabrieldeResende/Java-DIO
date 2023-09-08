package desafios;
import java.util.Scanner;


public class Desafio1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		 	System.out.println("Saldo atual: ");
	        double saldoAtual = scanner.nextDouble();
	        System.out.println("Deposito: ");
	        double valorDeposito = scanner.nextDouble();
	        System.out.println("Retirada: ");
	        double valorRetirada = scanner.nextDouble();
	        
	        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

	        double novoSaldo = (saldoAtual + valorDeposito) - valorRetirada;
	        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
	        
	        
	        System.out.println("Saldo atualizado na conta: " + String.format("%.2f", novoSaldo));
	}

}
