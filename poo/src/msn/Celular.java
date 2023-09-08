package msn;

public abstract class Celular {
	protected void validarConexaoInternet() {
		System.out.println("Conectado!");
	}
	
	public abstract void aplicativoBaixado();
}
