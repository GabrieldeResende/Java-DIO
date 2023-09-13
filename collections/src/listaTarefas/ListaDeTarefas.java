package listaTarefas;

import java.util.List;
import java.util.ArrayList;

public class ListaDeTarefas {
	
	private List<Tarefas> tarefaList;

	public ListaDeTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefas(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefas> tarefasParaRemover = new ArrayList<>();
		
		for(Tarefas tarefa : tarefaList) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefa);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalDeTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	
	public static void main(String[] args) {
		ListaDeTarefas listaTarefa = new ListaDeTarefas();
		
		System.out.println(listaTarefa.obterNumeroTotalDeTarefas());
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		System.out.println(listaTarefa.obterNumeroTotalDeTarefas());
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println(listaTarefa.obterNumeroTotalDeTarefas());
		listaTarefa.obterDescricoesTarefas();
	}
}
