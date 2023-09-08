package pessoa;

public class SistemaDeCadastro {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("07033...", "Gabriel");
		
		System.out.println(pessoa1.getCpf());
	}

}
