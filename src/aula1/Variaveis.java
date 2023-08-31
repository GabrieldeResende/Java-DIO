package aula1;

public class Variaveis {

	public static void main(String[] args) {
		int A = 5;
		String nome = "Gabriel";
		float B = 5.60F;
		boolean certo = true;
		final int nascimento = 1998;
		int anoAtual = 2023;
		
		int idade = anoAtual - nascimento;
		System.out.println("Idade: " + idade);
		
		if(certo) {
			System.out.println("Num:" + A + " Nome:" + nome + " double:" + B);
		}
		
		System.out.println("Passou do If");
	}

}
