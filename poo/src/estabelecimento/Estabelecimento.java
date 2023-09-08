package estabelecimento;

public class Estabelecimento {

	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		Almoxarife almoxarife = new Almoxarife();
		Atendente atendente = new Atendente();
		Cliente cliente1 = new Cliente();
		
		
		atendente.servindoMesa();
		
		cliente1.pagarConta();


	}
}
