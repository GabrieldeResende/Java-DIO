package compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, float preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		
		for(Item item : itemList) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(item);
			}
		}
		itemList.removeAll(itensParaRemover);
	}
	
	
	public void exibirItens() {
		System.out.println(itemList);
	}
	
	  public double calcularValorTotal() {
		    double valorTotal = 0d;
		    if (!itemList.isEmpty()) {
		      for (Item item : itemList) {
		        double valorItem = item.getPreco() * item.getQuantidade();
		        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
		      }
		      return valorTotal;
		    } else {
		      throw new RuntimeException("A lista está vazia!");
		    }
		  }
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Joaozinho perna torta", 19.99f, 1);
		carrinhoDeCompras.adicionarItem("Joaozinho perna reta", 29.99f, 2);
		carrinhoDeCompras.removerItem("Joaozinho perna torta");
		carrinhoDeCompras.exibirItens();
		System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
	}
}
