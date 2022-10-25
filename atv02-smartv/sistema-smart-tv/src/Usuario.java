
public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		//Teste de volume
		smartTv.diminuirVolume(); //volume = 24
		smartTv.diminuirVolume(); //volume = 23
		smartTv.diminuirVolume(); //volume = 22
		smartTv.aumentarVolume(); //volume = 23
		System.out.println("Volume atual: " + smartTv.volume);
		System.out.println("Canal atual: " + smartTv.canal);
		
		//Teste de canal
		smartTv.mudarCanal(13); //Definindo o canal
		
		System.out.println("Tv ligada: " + smartTv.ligada);
		System.out.println("Canal atual: " + smartTv.canal);
		System.out.println("Volume atual: " + smartTv.volume);
		
		//Teste de status da Tv
		smartTv.ligar();
		System.out.println("Novo status -> Tv ligada: " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status -> Tv ligada: " + smartTv.ligada);
	}

}
