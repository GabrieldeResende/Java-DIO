package estabelecimento;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("Controlando entrada dos itens!!");
	}
	
	private void controlarSaida() {
		System.out.println("Controlando saida dos itens!!");
	}
	
	void entregarIngredientes() {
		System.out.println("Entregando ingredientes!!");
		
		controlarSaida();
	}
	
	void trocarGas() {
		System.out.println("Almoxarife trocando o gas!!");
	}
}
