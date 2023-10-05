package desafio4;

import java.util.Scanner;

public class DesafioCofre {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tipoCofre = scanner.nextLine();

		// TODO: Implemente a condição necessário para a verificação dos cofres seguros:
		if (tipoCofre.equalsIgnoreCase("digital")) {

			// Se for um cofre digital, leia a senha
			int senha = scanner.nextInt();

			// Crie um cofre digital com a senha lida
			CofreDigital cofreDigital = new CofreDigital(senha);

			// Leia a tentativa de senha
			int tentativaSenha = scanner.nextInt();

			// Verifique se a senha está correta e imprima o resultado
			if (cofreDigital.validarSenha(tentativaSenha)) {
				cofreDigital.imprimirInformacoes();
				System.out.println("Cofre aberto!");
			} else {
				cofreDigital.imprimirInformacoes();
				System.out.println("Senha incorreta!");
			}
		} else if (tipoCofre.equalsIgnoreCase("fisico")) {
			// Se for um cofre físico, imprima as informações do cofre
			CofreFisico cofreFisico = new CofreFisico();
			cofreFisico.imprimirInformacoes();
		}
	}
}

abstract class Cofre {
	protected String tipo;
	protected String metodoAbertura;

	public Cofre(String tipo, String metodoAbertura) {
		this.tipo = tipo;
		this.metodoAbertura = metodoAbertura;
	}

	public void imprimirInformacoes() {
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Metodo de abertura: " + this.metodoAbertura);
	}
}

class CofreDigital extends Cofre {

	private int senha;

	public CofreDigital(int senha) {
		super("Cofre Digital", "Senha");
		this.senha = senha;
	}

	public boolean validarSenha(int confirmacaoSenha) {
		return confirmacaoSenha == this.senha;
	}
}

class CofreFisico extends Cofre {

	public CofreFisico() {
		super("Cofre Fisico", "Chave");
	}

}
