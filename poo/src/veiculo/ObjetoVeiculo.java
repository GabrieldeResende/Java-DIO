package veiculo;

public abstract class ObjetoVeiculo {
	private String chassi;
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void ligar() {
		confereCombustivel();
		confereCambio();
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel!!");
	}
	
	private void confereCambio() {
		boolean cambio = true;
		
		if(cambio) {
			System.out.println("Ligando Carro!");
			System.out.println("Carro ligado!!");
		} else {
			System.out.println("O carro deve estar no neutro para ligar!!");
		}
	}
	public void acelerar() {
		passarMarcha();
		System.out.println("Acelerando!!");
	}
	
	public abstract void passarMarcha();
}
