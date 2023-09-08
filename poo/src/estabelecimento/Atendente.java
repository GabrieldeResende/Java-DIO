package estabelecimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("Servindo a mesa!");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("Pegando lanche na cozinha!");
	}
	
	private void receberPagamento() {
		System.out.println("Recebendo pagamento!");
	}
	
	void trocarGas() {
		System.out.println("Atendente trocando o gas");
	}
	
	private void pegarPedidoBalcao() {
		System.out.println("Pegando o pedido no balcão");
	}
}
