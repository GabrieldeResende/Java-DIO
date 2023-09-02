package repeticao;

public class For {

	public static void main(String[] args) {
		
		for(int num = 0; num <=10; num++) {
			if(num == 5) {
				continue;
			}
			System.out.println(num);
		}
		
		String nomes[] = {"Gabriel", "Talia", "Alana", "Alan"};
		
		for(int nome = 0; nome<nomes.length; nome ++) {
			System.out.println("Nome no indice " + nome + " é: " + nomes[nome]);
		}
		
		System.out.println("--------------------------------------------------");
		
		for(String nome : nomes) {
			if(nome == "Alana") {
				break;
			}
			System.out.println(nome);
		}

	}

}
