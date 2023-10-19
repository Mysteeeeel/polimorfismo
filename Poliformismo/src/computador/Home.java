package computador;

public class Home implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("O computador está ligando");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("O computador está reiniciando");
	}
	
	@Override
	public void desligar() {
		System.out.println("O computador está desligando");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("O computador está carregando o sistema operacional");
	}

}