package internet;

public class Paginas {
	private String nomePagina;

	public Paginas(String nomePagina) {
		this.nomePagina = nomePagina;
	}

	public String getNomePagina() {
		return nomePagina;
	}
	
	@Override
	public String toString() {
		return "NavegadorInternet [paginasList: " + nomePagina + "]";
	}
	
	
}
