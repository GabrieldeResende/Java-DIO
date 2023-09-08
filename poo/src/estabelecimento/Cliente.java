package estabelecimento;

public class Cliente {
	
	public void escolherLanche() {
		System.out.println("escolhendo lanche!");
	}
	
	public void fazerPedido() {
		System.out.println("Fazendo pedido!");
	}
	
	public void pagarConta() {
		consultarSaldoAplicativo();
		System.out.println("Pagando conta!");
	}
	
	private void consultarSaldoAplicativo() {
		System.out.println("Consultando saldo no aplicativo!");
	}

}
