package metodos;

public class Metodos {

	public static void main(String[] args) {
		
		SmartTV smartTV = new SmartTV();
		
		System.out.println("Tv Ligada? " + smartTV.ligada);
		System.out.println("Canal atual: " + smartTV.canal);
		System.out.println("Volume atual: " + smartTV.volume);
		
		System.out.println("----------------------------------------------");
		
		smartTV.ligar();
		System.out.println("Novo = Tv Ligada? " + smartTV.ligada);
		
		smartTV.aumentarVolume();
		System.out.println("Novo Volume: " + smartTV.volume);
		
		smartTV.aumentarCanal();
		System.out.println("Novo Canal: " + smartTV.canal);

		System.out.println("----------------------------------------------");
		
		smartTV.desligar();
		System.out.println("Tv Ligada? " + smartTV.ligada);
		
		smartTV.diminuirVolume();
		System.out.println("Novo Volume: " + smartTV.volume);
		
		smartTV.diminuirCanal();
		System.out.println("Novo Canal: " + smartTV.canal);
		
		smartTV.mudarCanal(13);
		System.out.println("Novo Canal: " + smartTV.canal);
	}

}
