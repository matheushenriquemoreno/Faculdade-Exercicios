package Exercicio1;

public class Aluno {

	private int numeroMatricula;
	public String nome;
	public double notaBimestre1;
	public double notaBimestre2;
	
	public Aluno(int numeroMatricula, String nome, double notaBimestre1, double notaBimestre2) {
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
		this.notaBimestre1 = notaBimestre1;
		this.notaBimestre2 = notaBimestre2;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaBimestre1() {
		return notaBimestre1;
	}

	public void setNotaBimestre1(double notaBimestre1) {
		this.notaBimestre1 = notaBimestre1;
	}

	public double getNotaBimestre2() {
		return notaBimestre2;
	}

	public void setNotaBimestre2(double notaBimestre2) {
		this.notaBimestre2 = notaBimestre2;
	}
	
	public double calculaMediaEntreAsNotas() {
		return (this.notaBimestre1 + this.notaBimestre2) / 2.00;
	}
	
}