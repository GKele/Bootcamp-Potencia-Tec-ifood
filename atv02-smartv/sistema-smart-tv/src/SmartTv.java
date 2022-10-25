
public class SmartTv {
	//Estado inicial
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	//Alteração de canal através de definição do canal
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
	//Alteração de canal de 1 em 1
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	//Alteração de volume da Tv
	public void aumentarVolume(){
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	
	public void diminuirVolume(){
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}
	
	//Estado (ligado ou desligado) da Tv
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
}
