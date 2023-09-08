package estabelecimento;

public class Cozinheiro {
	
	public void adcionarLancheNoBalcao() {
		System.out.println("Adcionando lanche no balcão");
	}
	
	public void adcionarSucoNoBalcao() {
		System.out.println("Adcionando suco no balcão");
	}
	
	public void adcionarComboNoBalcao() {
		adcionarLancheNoBalcao();
		adcionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("Preparando lanche!!");
	}
	
	private void preparaVitamina() {
		System.out.println("Preparando vitamina!!");
	}
	
	private void prepararCombo() {
		prepararLanche();
		preparaVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionando pão, salada, ovo e carne");
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionando fruta, leite e suco");
	}
	
	private void lavarIngredientes() {
		System.out.println("Lavando os ingredientes!!");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("batendo vitamina no liquidificador!!");
	}
	
	private void pedirTrocaGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirTrocaGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife meuAmigo) {
		meuAmigo.entregarIngredientes();
	}
}
