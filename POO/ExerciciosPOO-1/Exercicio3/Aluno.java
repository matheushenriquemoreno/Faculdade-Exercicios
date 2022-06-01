package Exercicio3;

public class Aluno {
	
	private String matricula;
	
	private String nome;
	
	private double nota1;

	private double nota2;
	
	private double notaDeTrabalho;

	public Aluno(String matricula, String nome, double nota1, double nota2, double notaDeTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaDeTrabalho = notaDeTrabalho;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaDeTrabalho() {
		return notaDeTrabalho;
	}

	public void setNotaDeTrabalho(double notaDeTrabalho) {
		this.notaDeTrabalho = notaDeTrabalho;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome +
			   " \nMatricula: " + this.matricula + 
			   " \nNota 1 = " + this.nota1 +
			   " \nNota 2 = " + this.nota2 +
			   " \nNota trabalho = " + this.notaDeTrabalho; 
	}
	
	public double media() {
		return (this.nota1 + this.nota2 + this.notaDeTrabalho) / 3;
	}
	
	public double finall() {
		if(media() < 6) {
			return 10 - media();
		}
		return 0;
	}
}
