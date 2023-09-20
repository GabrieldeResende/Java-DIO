package internet;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
	private List<Paginas> paginasList;
	private int paginaAtual;
	
	public NavegadorInternet() {
		this.paginasList = new ArrayList<>();
	}


	public void adicionarNovaAba(String nomePagina) {
		paginasList.add(new Paginas(nomePagina));
	}
	
	public void exibirPagina() {
		if(!paginasList.isEmpty()) {
			System.out.println(this.paginasList);
		} else {
			System.out.println("Sem abas abertas!");
		}
	}
	
    public void atualizarPagina() {
        if (!paginasList.isEmpty() && paginaAtual >= 0 && paginaAtual < paginasList.size()) {
            System.out.println("A página '" + paginasList.get(paginaAtual).getNomePagina() + "' foi atualizada.");
        } else {
            System.out.println("Sem abas abertas para atualizar!");
        }
    }
    
    public static void main(String[] args) {
        NavegadorInternet navegador = new NavegadorInternet();

        navegador.adicionarNovaAba("www.example.com");
        navegador.exibirPagina();
        navegador.atualizarPagina();

        navegador.adicionarNovaAba("www.google.com");
        navegador.exibirPagina();
        navegador.atualizarPagina();
    }

	
}
