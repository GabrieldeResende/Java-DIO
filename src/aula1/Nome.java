package aula1;

public class Nome {

	public static void main(String[] args) {
		String primeiroNome = "Gabriel";
		String segundoNome = "Resende";
		String nome = Nome(primeiroNome, segundoNome);
		
		System.out.println(nome);

	}
	
	public static String Nome(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}

}
