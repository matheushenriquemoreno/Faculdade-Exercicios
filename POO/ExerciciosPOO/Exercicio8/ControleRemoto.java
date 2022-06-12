package Exercicio8;

public class ControleRemoto {
		
	private Televisao televisao;

	public ControleRemoto(Televisao televisao) {
		this.televisao = televisao;
	}
	
	public Televisao getTelevisao() {
		return televisao;
	}
	
	public void setTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}

	public void aumentaVolume() {
		televisao.aumentaVolume();
	}
	
	public void diminuiVolume(){
		televisao.diminuiVolume();
	}
	
	public void aumentaCanal() {
		televisao.AumentaCanal();
	}
	
	public void diminuiCanal() {
		televisao.diminuiCanal();
	}
	
	public void mudaCanalDesejado(int canal) {
		televisao.setCanal(canal);
	}
	
	public int volumeAtual() {
		return televisao.getVolume();
	}
	
	public int canalAtual() {
		return televisao.getCanal();
	}	
}