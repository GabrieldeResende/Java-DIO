package reprodutorMusical;

public class ReprodutorMusical extends Musicas {

	public static void main(String[] args) {
		ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
		
		reprodutorMusical.adicionarMusicas("Sweet Child On mine", "Guns n Roses");
		reprodutorMusical.adicionarMusicas("sunday bloody sunday", "U2");
		reprodutorMusical.adicionarMusicas("Hold the Line", "toto");
		reprodutorMusical.adicionarMusicas("Sweet Home Alabama", "Lynyrd Skynyrd");
		reprodutorMusical.adicionarMusicas("Sultans of Swings", "Dire Straits");
		
		reprodutorMusical.selecionarMusica("Hold the Line");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
	}
}
