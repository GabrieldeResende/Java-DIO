package aula1;

public class Operadores {

	public static void main(String[] args) {
		int A = 11; // um = representa atribuição
		int B = 5;

		if(A == 10) {  //dois == representa comparação
			System.out.println("Iguais");
		} else {
			System.out.println("Nao iguais");
		}
		
		System.out.println(A == 10 ? "Iguais" : "Nao Iguais"); // operador ternario
		System.out.println(A % 2 == 0 ? "Par" : "Impar"); // operador ternario
		
		// + soma; - subtrai; * multiplica; / divide; % restos da divisao
		
		int soma = A + B;
		int sub = A - B;
		int mult = A * B;
		int divi = A / B;
		
		System.out.println("soma: " + soma + " subtração: " + sub + " multiplicação: " + mult + " divisão: " + divi);
		// + representa a concatenação 
		
		while(A <= 20 ) {
			A += 2; // += acrescenta +2 no valor total da variavel
			System.out.println(A);
		}
	}

}
