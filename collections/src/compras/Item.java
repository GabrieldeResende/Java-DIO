package compras;

public class Item {
	private String nome;
	private float preco;
	private int quantidade;
	
	public Item(String nome, float preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return "Nome: " + nome + " quantidade: " + quantidade + " preço: " + preco;
	}
	
	public float calcularValorTotal() {
		float total = this.preco * this.quantidade;
		return total;
	}
}
