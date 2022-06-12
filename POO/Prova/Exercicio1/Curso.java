package Exercicio1;

import java.util.ArrayList;

public class Curso {

	protected  int codigo;
	protected  int cargaHoraria;
	protected  int sala;
	protected  String nomeCurso;
	protected  String nomeProfessor;
	protected  double valorCurso;
	protected  ArrayList<Aluno> alunos;
	
	public Curso(int codigo, int cargaHoraria, int sala,String nomeCurso, String nomeProfessor, double valorCurso,
			ArrayList<Aluno> alunos) {
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.sala = sala;
		this.nomeCurso = nomeCurso;
		this.nomeProfessor = nomeProfessor;
		this.valorCurso = valorCurso;
		this.alunos = alunos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void printaAlunosCurso() {
		System.out.println("Alunos matriculados no curso.");
		alunos.forEach(a -> System.out.println(a));
	}
	
	@Override
	public String toString() {
		return "codigo = " + codigo + ", carga Horaria = " + cargaHoraria + ", sala = " + sala + ", nome Curso = "
				+ nomeCurso + ", \nnome Professor = " + nomeProfessor + ", valor Curso = " + valorCurso; 
	}

}
