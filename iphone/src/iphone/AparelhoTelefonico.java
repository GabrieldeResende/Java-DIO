package iphone;

public class AparelhoTelefonico {
	public void ligar() {
		System.out.println("Ligando!");
	}
	
	public void ateder() {
		System.out.println("Atendendo uma ligação");
	}
	
	public void iniciarCorrerioVoz() {
		System.out.println("Enviando uma mensagem!");
	}
	
	public static void main(String[] args) {
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
		
		
		aparelhoTelefonico.ligar();
	}
}
