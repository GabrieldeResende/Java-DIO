package veiculo;

public class Veiculo {

	public static void main(String[] args) {
		ObjetoCarro jepp = new ObjetoCarro();
		
		jepp.ligar();
		jepp.setChassi("12345");
		
		jepp.passarMarcha();
		
		
		System.out.println(jepp.getChassi());
		
		ObjetoMoto z400 = new ObjetoMoto();
		
		z400.setChassi("123456");
		
		System.out.println("Chassi moto: " + z400.getChassi());
		
		z400.passarMarcha();

	}

}
