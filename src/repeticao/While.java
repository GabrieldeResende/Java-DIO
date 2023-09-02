package repeticao;

public class While {

	public static void main(String[] args) {
		
		int mesada = 50;
		int valorDoce = 5;
		System.out.println("Total da mesada: " + mesada);
		
		while(mesada != 0) {
			
			mesada = mesada - valorDoce;
			System.out.println("Doce comprado!!");
			System.out.println("Total da mesada: " + mesada);
			
		}
		
		System.out.println("Joaozinho gastou toda sua mesada!!");
	}

}
