package validacaoProcessoSeletivo;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcesseSeletivo {

	public static void main(String[] args) {
		String [] candidatos = {"Gabriel", "Adriana"};
		
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}

	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando) {
				tentativasRealizadas ++;
			} else {
				System.out.println("Contato realizado com sucesso");
			}
			
		} while(continuarTentando && tentativasRealizadas < 3);
		
		
		if(atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa!!");
		} else {
			System.out.println("Nao conseguimos contato com " + candidato + " numero maximo de tentativas " + tentativasRealizadas + " realizadas!");
		}
		
	}
	
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Gabriel", "Adriana"};
		
		System.out.println("Candidatos selecionados!");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de numero " + (indice + 1) + " é: " + candidatos[indice]);
		}
		
		System.out.println("Candidatos selecionados com for each!!");
		
		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}
		
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Gabriel", "Adriana", "Leticia", "Fernando", "Adalbas"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 2 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salario: " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado!!");
				candidatosSelecionados++;
			}
			
			candidatoAtual ++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para candidato!!");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contra proposta!!");
		} else {
			System.out.println("Aguardando outras candidaturas!!");
		}
	}

}
