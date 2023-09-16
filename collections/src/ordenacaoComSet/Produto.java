package ordenacaoComSet;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private String nome;
	private long codigoProduto;
	private double preco;
	private int quantidade;
	
	
	public Produto(String nome, long cod, double preco, int quantidade) {
		this.nome = nome;
		this.codigoProduto = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public long getCodigoProduto() {
		return codigoProduto;
	}


	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigoProduto == other.codigoProduto;
	}

	@Override
	public String toString() {
		return "Produto [nome: " + nome + ", codigoProduto: " + codigoProduto + ", preco: " + preco + ", quantidade: "
				+ quantidade + "]";
	}

	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}
	
}

class ComparatorPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}
