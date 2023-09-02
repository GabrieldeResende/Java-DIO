package repeticao;

public class DoWhile {

	public static void main(String[] args) {
		int mesada = 50;
		int doce = 5;
		
		System.out.println("valor mesada: " + mesada);
		do {
			mesada = mesada - doce;
			System.out.println("valor mesada: " + mesada);
		} while(mesada != 0);
		
		int cerveja = 100;
		int gole = 10;
		
		System.out.println(cerveja);
		do {
			cerveja = cerveja - gole;
			System.out.println(cerveja);
		} while(cerveja != 0);
	}

}
