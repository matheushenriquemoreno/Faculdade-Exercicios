package Exercicio1;

public class Funcionario {
	
	private String nome;
	private double salario;

	public Funcionario(String nome) {
		this.nome = nome;
		this.salario = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double calculaSalario(double vendasBrutas) {
		
		if(vendasBrutas > 8000) {
			this.salario =  vendasBrutas +  382.33 + (vendasBrutas * 0.0875);	
		}
		else {
			this.salario = vendasBrutas +  177.12 + (vendasBrutas * 0.0387);
		}
		return salario;
	}
}