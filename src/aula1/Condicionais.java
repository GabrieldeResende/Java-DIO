package aula1;

public class Condicionais {

	public static void main(String[] args) {
		
		double saldo = 50.0;
		double saque = 40.0;
		
		if(saque < saldo) {
			saldo -= saque;
			System.out.println("Saque realizado com sucesso!!");
			System.out.println("Novo saldo: " + saldo);
		} else {
			System.out.println("Saldo insuficiente!!");
		}
		
		saque = 5.0;
		if(saque < saldo) {
			saldo -= saque;
			System.out.println("Saque realizado com sucesso!!");
			System.out.println("Novo saldo: " + saldo);
		} else {
			System.out.println("Saldo insuficiente!!");
		}
		
		System.out.println("---------------------------------------");
		
		int num = 10;
		
		System.out.println(num / 2 == 0 ? "Impar" : "par"); // (condição) ? (primeiro resultado) : (segundo resultado)
		
		System.out.println("---------------------------------------");
		
		int nota = 10;
		
		if(nota >= 7) {
			System.out.println("Aprovado!!");
		}else if(nota == 5) {
			System.out.println("Recuperação!!");
		} else {
			System.out.println("Reprovado!!");
		}	
		
		System.out.println(nota >= 7 ? "Aprovado!!" : nota == 5 ? "Recuperação!!" : "Reprovado!!");
	}

}
