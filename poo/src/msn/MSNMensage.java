package msn;

public class MSNMensage extends Celular {
	
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando Mensagem!");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Mensagem recebida!");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Historico salvo!");
	}

	public void aplicativoBaixado() {
		System.out.println("Aplicativo ja baixado!");
	}
}
