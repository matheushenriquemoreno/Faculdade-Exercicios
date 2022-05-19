package Exercicio7;

public class Elevador {
	
	private int andarAtual;
	
	private int totalDeAndares;
	
	private int quantidadePessoas;
	
	private int capacidadeTotalDePessoas;
	
	public Elevador(int totalDeAndares, int capacidadeElevador) {	
		inicializa(totalDeAndares, capacidadeElevador);
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public int getCapacidadeTotalDePessoas() {
		return capacidadeTotalDePessoas;
	}

	public void setCapacidadeTotalDePessoas(int capacidadeTotalDePessoas) {
		this.capacidadeTotalDePessoas = capacidadeTotalDePessoas;
	}
	
	public void inicializa(int capacidadeElevedor, int totalDeAndadres) {
		this.andarAtual = 0;
		this.quantidadePessoas = 0;
		this.capacidadeTotalDePessoas = capacidadeElevedor;
		this.totalDeAndares = totalDeAndadres;
	}
	
	public void entra() {
		if(this.quantidadePessoas == this.capacidadeTotalDePessoas) {
			System.out.println("Capacidade maxima atiginda");
		}else {
			this.quantidadePessoas++;
		}
	}
	
	public void sai() {
		if(this.quantidadePessoas > 0) {
			this.quantidadePessoas--;
		}
	}
	
	public void sobe() {
		if(this.andarAtual == totalDeAndares) {
			System.out.println("Andar altual ja e o ultimo!");
		}
		else {
			this.andarAtual++;
		}
	}
	
	public void desce() {
		if(this.andarAtual == 0) {
			System.out.println("Você está atualmente no tereo!");
		}
		else {
			andarAtual--;
		}
	}		
	
	@Override
	public String toString() { 
		return "Andar atual = " + this.andarAtual + 
				" \nTotal de andares = " + this.totalDeAndares +
				" \nQuantidade de pessoas atual = " + this.quantidadePessoas +
				" \nCapacidade maxima de pessoas = " + this.capacidadeTotalDePessoas;
 	}
}