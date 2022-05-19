package Exercicio8;

public class Televisao {
	
	private int canal;
	private int volume;
	private int TotalCanais;
	
	public Televisao(int totalCanais) {
		this.TotalCanais = totalCanais;
		this.canal = 0;
		this.volume = 0;
	}
	
	public int getTotalCanais() {
		return TotalCanais;
	}

	public void setTotalCanais(int totalCanais) {
		TotalCanais = totalCanais;
	}

	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		if(canal > this.TotalCanais || canal < 0) {
			System.out.println("Valor informado para canal inexistente.");
		}
		else {
			this.canal = canal;	
		}
	}
	
	public void AumentaCanal() {
		this.canal++;
	}
	
	public void diminuiCanal() {
		if(this.canal == 0) {
			this.canal = this.TotalCanais;
		}
		else {
			this.canal--;
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void aumentaVolume() {
		this.volume++;
	}
	
	public void diminuiVolume() {
		if(this.volume == 0) {
			System.out.println("Impossivel abaixar volume atual = 0");
		}
		else {
		this.volume--;
		}
	}
	
	
	@Override
	public String toString() {
		return "Canal atual = " + this.canal + " Total de canais = " +  this.TotalCanais + " Volume = " + this.volume;
	}
	
	
	
}