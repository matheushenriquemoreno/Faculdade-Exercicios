package Exercicio1;

import java.util.ArrayList;

public class CursoMestrado extends Curso {

	
	private boolean strictoSensu;
	private double adicionalDiploma;
	
	public CursoMestrado(int codigo, int cargaHoraria, int sala, String nomeCurso, String nomeProfessor, double valorCurso,
			ArrayList<Aluno> alunos, boolean strictoSensu) {
		super(codigo, cargaHoraria, sala, nomeCurso, nomeProfessor, valorCurso, alunos);
		this.strictoSensu = strictoSensu;
	}

	public boolean isStrictoSensu() {
		return strictoSensu;
	}

	public void setStrictoSensu(boolean strictoSensu) {
		this.strictoSensu = strictoSensu;
	}

	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}

	public void setAdicionalDiploma() {
		if(getAlunos().size() <= 5) {
			adicionalDiploma = 45.00;
		}
		else if(getAlunos().size() <= 15) {
			adicionalDiploma = 43.00;
		}
		else if(getAlunos().size() <= 30) {
			adicionalDiploma = 40.00;
		}
		else {
			adicionalDiploma = 36.00;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "stricto Sensu = "+ strictoSensu;
	}
	
}