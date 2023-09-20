package reprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class Musicas {
	private String nomeMusica;
	private String nomeBanda;
	private List<Musicas> musicaList;
	
	public Musicas() {
		this.musicaList = new ArrayList<>();
	}
	
	public Musicas(String nomeMusica, String nomeBanda) {
		this.nomeMusica = nomeMusica;
		this.nomeBanda = nomeBanda;
	}
	public String getNomeMusica() {
		return nomeMusica;
	}

	public String getNomeBanda() {
		return nomeBanda;
	}
	
	
	public void adicionarMusicas(String nomeMusica, String nomeBanda) {
		musicaList.add(new Musicas(nomeMusica, nomeBanda));
	}
	
	public List<Musicas> selecionarMusica(String nomeMusica) {
		List<Musicas> musicaTocando = new ArrayList<>();
		if (!musicaList.isEmpty()) {
			for (Musicas musica : musicaList) {
				if (musica.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
					musicaTocando.add(musica);
				}
			}
			System.out.println("musica selecionada: " + musicaTocando);
		} else {
			throw new RuntimeException("nenhuma musica na lista!!");
		}
		return musicaTocando;
	}
	
	public void tocar() {
		System.out.println("Tocando musica");
	}
	
	public void pausar() {
		System.out.println("Musica pausada!");
	}

	@Override
	public String toString() {
		return " nomeMusica: " + nomeMusica + ", nomeBanda: " + nomeBanda;
	}
	
	
}
